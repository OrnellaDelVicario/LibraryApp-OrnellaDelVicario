package org.library;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Modifier;

class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Effective Java", "Joshua Bloch", 45.99);
    }

    @Test
    @DisplayName("Book should have correct fields assigned")
    void testBookCreation() {
        assertEquals("Effective Java", book.getTitle());
        assertEquals("Joshua Bloch", book.getAuthor());
        assertEquals(45.99, book.getPrice(), 0.001);
    }

    @Test
    @DisplayName("Book fields must be final")
    void testFieldsAreFinal() throws NoSuchFieldException {
        Class<Book> bookClass = Book.class;

        assertTrue(Modifier.isFinal(bookClass.getDeclaredField("title").getModifiers()));
        assertTrue(Modifier.isFinal(bookClass.getDeclaredField("author").getModifiers()));
        assertTrue(Modifier.isFinal(bookClass.getDeclaredField("price").getModifiers()));
    }
}

