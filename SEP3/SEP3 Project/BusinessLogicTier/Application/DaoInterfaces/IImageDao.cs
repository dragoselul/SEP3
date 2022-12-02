using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IImageDao
{
    Task<Image> UploadImage(ImageCreationDto dto);
    Task<List<Image>> GetImagesByItemId(int id);
    Task<Image> GetImageById(int id);
    Task DeleteImageById(int id);
}