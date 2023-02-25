package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepo;

@Service
public class ApiService
{
@Autowired
BookRepo repository;
public boolean addStudent(Book book)
{
repository.save(book);
return true;
}
public List<Book>getBook()
{
return repository.findAll();
}
public Optional<Book>getBookById(int id)
{
return repository.findById(id);
}
public String updateStudent(Book book)
{
repository.save(book);
return "Updated";
}
public boolean deleteBookById(int id)
{
repository.deleteById(id);
return true;
}
}