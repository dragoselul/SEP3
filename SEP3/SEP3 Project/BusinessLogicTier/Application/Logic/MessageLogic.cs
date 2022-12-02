using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class MessageLogic : IMessageLogic
{

    private readonly IMessageDao messageDao;

    public MessageLogic(IMessageDao messageDao)
    {
        this.messageDao = messageDao;
    }
    
    public Task<Message> CreateAsync(MessageCreationDto post)
    {
        ValidateMessage(post);
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

    private static void ValidateMessage(MessageCreationDto dto)
    {
        if (dto.content == "")
        {
            throw new Exception("The content of the message cannot be empty");
        }
    }

    public async Task DeleteMessageByIdAsync(int id)
    {
        await messageDao.DeleteMessageByIdAsync(id);
    }
}