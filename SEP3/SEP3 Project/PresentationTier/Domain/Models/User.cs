﻿namespace Domain.Models;

public class User
{
    public int id { get; set; }
    public string firstName { get; set; }
    public string lastName { get; set; }
    public string email { get; set; }
    public string password { get; set; }
    public string phoneNumber { get; set; }
    public bool gender { get; set; }
    public DateTime dor { get; set; }

    public List<Items> Items { get; set; }
    
}