using Google.Protobuf;

namespace Domain.DTOs;

public class ImageCreationDto
{
    public string base64data { get; init; }
    public string contentType { get; init; }
    public string fileName { get; init; }
    public long ItemId { get; init; }
}