using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IConversationDao
{
    
    Task<Conversation> CreateAsync(ConversationCreationDto post);
    Task<List<Conversation>> GetByUserIdAsync(int userId);
    Task<Conversation> GetByIdAsync(int id);
    Task DeleteByIdAsync(int id);
}