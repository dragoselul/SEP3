using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class MessageLogic : IMessageLogic
{

    private readonly IMessageDao messageDao;
    
    public Task<Message> CreateAsync(MessageCreationDto post)
    {
        return messageDao.CreateAsync(post);
    }

    public Task<List<Message>> GetByConversationIdAsync(int conversationId)
    {
        return messageDao.GetByConversationIdAsync(conversationId);
    }

    public Task<Message> GetByIdAsync(int id)
    {
        return messageDao.GetByIdAsync(id);
    }
}