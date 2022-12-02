namespace Domain.Models;

public class Image
{
    public long Id { get; init; }
    public byte[] image { get; init; }
    public long ItemId { get; init; }
}