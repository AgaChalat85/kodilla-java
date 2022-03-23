package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> libraryA = new HashSet<>();
        libraryA.add(new Book("The Master and Margarita", "Mikhail Bulgakov", 1975, "AFG525252"));
        libraryA.add(new Book("The Shadow of the Wind", "Carlos Ruiz Zafón", 2005, "ATZ7895421"));
        libraryA.add(new Book("Doctor Zhivago", "Boris Pasternak", 1957, "ASC646333"));
        libraryA.add(new Book("The Book Thief", "Markus Zusak", 2004, "AHJ908754"));
        libraryA.add(new Book("Nineteen minutes", "Jodi Picoult", 2007, "ABV726325325"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(libraryA);
        //Then
        System.out.println(medianPublicationYear);
        assertEquals(medianPublicationYear, 2004);
    }
}
