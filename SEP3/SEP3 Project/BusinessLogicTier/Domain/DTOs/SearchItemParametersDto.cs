namespace Domain.DTOs;

public class SearchItemParametersDto
{
    public string? Name { get; init; }
    public string? Description { get; init; }
    public int? ContactId { get; init; }
    public double? Pricing { get;init;}
    public bool? IsSold { get;init; }
}