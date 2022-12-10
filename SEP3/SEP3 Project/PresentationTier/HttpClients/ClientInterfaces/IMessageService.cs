using Domain.DTOs;
using Domain.Models;

public interface IMessageService
{
    Task<Message?> Create(MessageCreationDto dto);
    Task<Message> GetById(int id);
    Task<List<Message>> GetByConversationId(int userId);
    Task Delete(int id);
}