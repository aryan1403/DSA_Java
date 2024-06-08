package com.example.Models;
import lombok.Data;

@Data
public class Book {
    private String id;
    private String name;
    private String author;
    private double price;
    private String type;
}
