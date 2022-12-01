using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IMessageDao
{
    Task<Message> CreateAsync(MessageCreationDto post);
    Task<List<Message>> GetByConversationIdAsync(int userId);
    Task<Message> GetByIdAsync(int id);
}