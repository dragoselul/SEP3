using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
namespace Application.Logic;

public class ConversationLogic : IConversationLogic
{
    
    private readonly IConversationDao conversationDao;

    public ConversationLogic(IConversationDao conversationDao)
    {
        this.conversationDao = conversationDao;
    }
    
    public Task<Conversation> CreateAsync(ConversationCreationDto dto)
    {
        return conversationDao.CreateAsync(dto);
    }

    public Task<List<Conversation>> GetByUserIdAsync(int userId)
    {
        return conversationDao.GetByUserIdAsync(userId);
    }

    public Task<Conversation> GetByIdAsync(int id)
    {
        return conversationDao.GetByIdAsync(id);
    }
}