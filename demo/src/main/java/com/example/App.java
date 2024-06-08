package com.example;

import java.util.UUID;

import com.example.DB.db;
import com.example.Models.Book;

public class App {
    public static void main(String[] args) {
        db mongo = new db();
        Book b1 = new Book();
        b1.setName("Atomic Habits");
        b1.setAuthor("Morgan Housel");
        b1.setPrice(2000);
        b1.setType("Self");

        // mongo.insertBook(b1);
        mongo.deleteBook("Atomic Habits");
    }
}
