using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class ImageLogic :IImageLogic
{
    private readonly IImageDao ImageDao;

    public ImageLogic(IImageDao imageDao)
    {
        ImageDao = imageDao;
    }

    public async Task<Image> UploadImage(ImageCreationDto dto)
    {
        return await ImageDao.UploadImage(dto);
    }

    public async Task<List<Image>> GetImagesByItemId(int id)
    {
        return await ImageDao.GetImagesByItemId(id);
    }

    public async Task<Image> GetImageById(int id)
    {
        return await ImageDao.GetImageById(id);
    }

    public async Task DeleteImageById(int id)
    {
        await ImageDao.DeleteImageById(id);
    }
}