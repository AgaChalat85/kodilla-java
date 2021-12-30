package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library1 = new Library("Library nr 1");

        Book book1 = new Book("The Master and Margarita", "Mikhail Bulgakov", LocalDate.of(1975, 10, 23));
        Book book2 = new Book("Evil Under the Sun", "Agatha Christie", LocalDate.of(1941, 5, 13));
        Book book3 = new Book("Animal Farm", "George Orwell", LocalDate.of(1945, 6, 27));
        Book book4 = new Book("Before I go to sleep", "Steve Watson", LocalDate.of(2014, 12, 2));
        Book book5 = new Book("Gone girl", "Gillian Flynn", LocalDate.of(2012, 7, 6));
        Book book6 = new Book("The Book Thief", "Markus Zusak", LocalDate.of(2005, 3, 11));

        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);
        library1.getBooks().add(book4);
        library1.getBooks().add(book5);
        library1.getBooks().add(book6);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("Library nr 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library1);
        System.out.println(clonedLibrary);

        assertEquals(6, library1.getBooks().size());
        assertEquals(6, clonedLibrary.getBooks().size());

    }
}

