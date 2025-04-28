package org.library;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    @DisplayName("Library should start empty")
    void testLibraryStartsEmpty() {
        assertEquals(0, library.totalBooks());
    }

    @Test
    @DisplayName("Adding books should increase total")
    void testAddingBooks() {
        library.addBook(new Book("Clean Code", "Robert C. Martin", 37.95));
        library.addBook(new Book("The Pragmatic Programmer", "Andy Hunt", 42.00));

        assertEquals(2, library.totalBooks());
    }

    @Test
    @DisplayName("Library should calculate total price of books")
    void testCalculateTotalPrice() {
        library.addBook(new Book("Book 1", "Author 1", 15.50));
        library.addBook(new Book("Book 2", "Author 2", 24.50));

        assertEquals(40.00, library.calculateTotalPrice(), 0.001);
    }
}
