package net.mega4games.bookmanager.service;

import net.mega4games.bookmanager.model.Book;

import java.util.List;

public interface BookService {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

    public void readBook(int id);

    public Book searchBook(Book book);
}
