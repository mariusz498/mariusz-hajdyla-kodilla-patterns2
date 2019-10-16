package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given
        Library library = new Library("first library");
        library.addBook("First title", "First author", LocalDate.now());
        library.addBook("Second title", "Second author", LocalDate.now());

        //When

        Library libraryClone = library.shallowCopy();
        libraryClone.setName("library shallow copy");
        Library libraryDeepClone = library.deepCopy();
        libraryDeepClone.setName("library deep copy");
        library.addBook("Third title", "Third author", LocalDate.now());
        libraryDeepClone.addBook("New title", "New author", LocalDate.now());
        Set<Book> firstBooks = library.getBooks();
        Set<Book> secondBooks = libraryClone.getBooks();
        Set<Book> thirdBooks = libraryDeepClone.getBooks();

        //Then
        System.out.println(library.getName());
        library.getBooks().stream().forEach(book -> System.out.println(book.toString()));
        System.out.println(libraryClone.getName());
        libraryClone.getBooks().stream().forEach(book -> System.out.println(book.toString()));
        System.out.println(libraryDeepClone.getName());
        libraryDeepClone.getBooks().stream().forEach(book -> System.out.println(book.toString()));
        Assert.assertEquals(3, firstBooks.size());
        Assert.assertEquals(3, secondBooks.size());
        Assert.assertEquals(3, thirdBooks.size());
    }
}
