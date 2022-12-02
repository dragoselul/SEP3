using Google.Protobuf;

namespace Domain.DTOs;

public class ImageCreationDto
{
    public ByteString image { get; init; }
    public long ItemId { get; init; }
}