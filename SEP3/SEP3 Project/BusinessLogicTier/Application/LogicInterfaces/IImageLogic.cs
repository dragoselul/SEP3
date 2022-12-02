using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IImageLogic
{
    Task<Image> UploadImage(ImageCreationDto dto);
    Task<List<Image>> GetImagesByItemId(int id);
    Task<Image> GetImageById(int id);
    Task DeleteImageById(int id);
}