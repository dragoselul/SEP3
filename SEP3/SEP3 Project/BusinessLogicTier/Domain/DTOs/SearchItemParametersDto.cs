using Domain.Models;

namespace Domain.DTOs;

public class SearchItemParametersDto
{
    public string? Name { get; init; }
    public string? Description { get; init; }
    public int? ContactId { get; init; }
    public double? MinPrice { get; init; }
    public double? MaxPrice { get; init; }
    public bool? IsSold { get; init; }
    public string? Category { get; init; }
}