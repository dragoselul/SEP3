using System.ComponentModel.DataAnnotations;
using Domain.Models;

namespace Domain.DTOs;

public class ItemCreationDto
{
    [Required (ErrorMessage = "Title field is required")]
    public string Name { get; set; }
    [Required (ErrorMessage = "Description field is required")]
    public string Description { get; set; }
    public int ContactId { get; set; }
    [Required (ErrorMessage = "Price field is required")]
    public double Pricing { get; set; }
    
    [Required (ErrorMessage = "Category choice field is required")]
    public string Category { get; set; }
    [Required (ErrorMessage = "Currency field is required")]
    public string Currency { get; set; }
    public bool IsSold { get; set; }
    // public byte[] Photos { get;}
    
}