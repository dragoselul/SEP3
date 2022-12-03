namespace Domain.Models;

public class Image
{
    public long Id { get; init; }
    public string base64data { get; init; }
    public string contentType { get; init; }
    public string fileName { get; init; }
    public long ItemId { get; init; }
}