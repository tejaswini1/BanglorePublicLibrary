package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by tejaswinibhosle on 03/06/15.
 */
public class Library {
    ArrayList<Book> booksList = new ArrayList<Book>();



    public boolean initialize(){

        booksList.add(new Book("TDD","Kent",2000));
        booksList.add(new Book("Alchemist","Paulo",1996));
        booksList.add(new Book("Famous Five","Paulo",1990));

        return !booksList.isEmpty();
    }

    public boolean displayBooks(){

        if(booksList.isEmpty()){
            System.out.println("Sorry! somethings went wrong . No books available");
            return false;}
        for(Book book: booksList){
            System.out.println(book);
        }
        return true;

    }
}
