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
    
    public async Task<Conversation> CreateAsync(ConversationCreationDto dto)
    {
        return await conversationDao.CreateAsync(dto);
    }

    public async Task<List<Conversation>> GetByUserIdAsync(int userId)
    {
        return await conversationDao.GetByUserIdAsync(userId);
    }

    public async Task<Conversation> GetByIdAsync(int id)
    {
        return await conversationDao.GetByIdAsync(id);
    }

    public async Task DeleteConversationByIdAsync(int id)
    {
        await conversationDao.DeleteByIdAsync(id);
    }
}