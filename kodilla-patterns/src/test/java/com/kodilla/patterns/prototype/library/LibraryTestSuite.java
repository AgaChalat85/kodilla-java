package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Library nr 1");

        Book book1 = new Book("The Master and Margarita", "Mikhail Bulgakov", LocalDate.of(1975, 10, 23));
        Book book2 = new Book("Evil Under the Sun", "Agatha Christie", LocalDate.of(1941, 5, 13));
        Book book3 = new Book("Animal Farm", "George Orwell", LocalDate.of(1945, 6, 27));
        Book book4 = new Book("Before I go to sleep", "Steve Watson", LocalDate.of(2014, 12, 2));
        Book book5 = new Book("Gone girl", "Gillian Flynn", LocalDate.of(2012, 7, 6));
        Book book6 = new Book("The Book Thief", "Markus Zusak", LocalDate.of(2005, 3, 11));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        assertEquals(5, library.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(6, deepClonedLibrary.getBooks().size());

    }
}

