package com.example.demo.DAO;

import com.example.demo.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository  extends MongoRepository<Book, Integer> {
    //can define methods here like find by title or author
}
