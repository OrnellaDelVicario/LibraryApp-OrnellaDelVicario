package org.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int totalBooks() {
        return books.size();
    }


    public double calculateTotalPrice() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }


    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
