using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IImageService
{
    Task<Image?> UploadImage(ImageCreationDto dto);
    Task<List<Image>> GetImagesByItemId(int id);
    Task<Image> GetImageById(int id);
    Task DeleteImageById(int id);
}