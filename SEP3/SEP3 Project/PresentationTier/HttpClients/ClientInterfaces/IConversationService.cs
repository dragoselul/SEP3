using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IConversationService
{
    Task<Conversation?> Create(ConversationCreationDto dto);
    Task<Conversation> GetById(int id);
    Task<List<Conversation>> GetByUserId(int userId);
    Task Delete(int id);
}