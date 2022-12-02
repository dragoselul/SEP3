using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IMessageLogic
{
    Task<Message> CreateAsync(MessageCreationDto post);
    Task<List<Message>> GetByConversationIdAsync(int conversationId);
    Task<Message> GetByIdAsync(int id);
    Task DeleteMessageByIdAsync(int id);
}