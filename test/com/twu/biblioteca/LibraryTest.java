package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    @Test
    public void shouldReturnTrueIfBooksAreAvailble(){

        Library library=new Library();
        library.initialize();

        assertEquals(true,library.displayBooks());
    }

    @Test
    public void shouldReturnTrueForInitializingBooksInLibrary(){

        Library library=new Library();
        assertEquals(true,library.initialize());
    }
}
