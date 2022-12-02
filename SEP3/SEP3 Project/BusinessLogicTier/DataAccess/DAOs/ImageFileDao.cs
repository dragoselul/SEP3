using Application.DaoInterfaces;
using DataAccess.ProtoConverters;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;
using gRPCClient;
using static gRPCClient.ImageService;
using Image = Domain.Models.Image;

namespace FileData.DAOs;

public class ImageFileDao : IImageDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private ImageServiceClient ImageClient;

    public ImageFileDao(ImageServiceClient imageClient)
    {
        ImageClient = new ImageServiceClient(channel);
    }


    public async Task<Image> UploadImage(ImageCreationDto dto)
    {
        gRPCClient.Image uploaded = await ImageClient.UploadImageAsync(new UploadImageDto()
        {
            Image = dto.image,
            ItemId = dto.ItemId
        });

        Image image = ClassConverter.ConvertProtoToDomain(uploaded);
        return await Task.FromResult(image);
    }

    public async Task<List<Image>> GetImagesByItemId(int id)
    {
        List<Image> images = new();
        try
        {
            while (true)
            {
                gRPCClient.Image? image = ImageClient.GetImageByItemId(new SearchImageDto() { Id = 0, ItemId = id}).ResponseStream.Current;
                Image toSend = ClassConverter.ConvertProtoToDomain(image);
                images.Add(toSend);
            }
        }
        catch (Exception e)
        {
            Console.WriteLine("We got all the items");
        }
        
        return await Task.FromResult(images);
    }

    public async Task<Image> GetImageById(int id)
    {
        gRPCClient.Image toSend = await ImageClient.GetImageByIdAsync(new SearchImageDto()
        {
            Id = id,
            ItemId = 0
        });

        Image image = ClassConverter.ConvertProtoToDomain(toSend);
        return await Task.FromResult(image);
    }

    public async Task DeleteImageById(int id)
    {
        await ImageClient.DeleteImageByIdAsync(new SearchImageDto()
        {
            Id = id,
            ItemId = 0
        });
    }
}