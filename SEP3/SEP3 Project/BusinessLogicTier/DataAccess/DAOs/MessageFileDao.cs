using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace FileData.DAOs;

public class MessageFileDao : IMessageDao
{
    
    public MessageFileDao()
    {
        
    }
    
    public Task<Message> CreateAsync(MessageCreationDto post)
    {
        throw new NotImplementedException();
    }

    public Task<List<Message>> GetByConversationIdAsync(int userId)
    {
        throw new NotImplementedException();
    }

    public Task<Message> GetByIdAsync(int id)
    {
        throw new NotImplementedException();
    }
}