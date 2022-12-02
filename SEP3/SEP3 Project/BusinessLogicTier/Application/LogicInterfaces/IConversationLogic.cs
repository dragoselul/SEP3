using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IConversationLogic
{
    Task<Conversation> CreateAsync(ConversationCreationDto dto);
    Task<List<Conversation>> GetByUserIdAsync(int userId);
    Task<Conversation> GetByIdAsync(int id);
    Task DeleteConversationByIdAsync(int id);
}