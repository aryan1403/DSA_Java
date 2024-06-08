package com.example.DB;

import java.util.List;
import java.util.UUID;

import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;
import com.example.Models.Book;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class db {
    MongoClient client;
    MongoDatabase database;
    MongoCollection<Document> collection;
    public db() {
        String uri = "mongodb://localhost:27017";
        client = MongoClients.create(uri);
        database = client.getDatabase("bookdb");
        collection = database.getCollection("books");
    }
    public void insertBook(Book book) {
        Document doc = new Document();
        doc.append("id", UUID.randomUUID().toString());
        doc.append("name", book.getName());
        doc.append("author", book.getAuthor());
        doc.append("price", book.getPrice());
        doc.append("type", book.getPrice());

        collection.insertOne(doc);
    }

    public void getAllBooks() {
        collection.find().forEach(doc -> {
            System.out.println(doc.toString());
        });
    }

    public void deleteBook(String name) {
        collection.deleteOne(eq("name", name));
    }
}
