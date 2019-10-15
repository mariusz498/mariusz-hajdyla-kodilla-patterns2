package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("first library");
        library.books.add(new Book("First title", "First author", LocalDate.now()));
        library.books.add(new Book("Second title", "Second author", LocalDate.now()));

        //When
        Set<Book> firstBooks = library.getBooks();

        //Then
        library.getBooks().stream().forEach(book -> System.out.println(book.toString()));
        Assert.assertEquals(2, firstBooks.size());
    }
}
