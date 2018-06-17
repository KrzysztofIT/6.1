package com.kodilla.patterns.prototype.library;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("book 1" , "John" , LocalDate.of(2000 , 01 , 10));
        Book book2 = new Book("book 2" , "Mary" , LocalDate.of(2010 , 05 , 03));
        library.books.add(book1);
        library.books.add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.books.remove(book2);

        //Then
        System.out.println(library.getName());
        library.getBooks().stream().forEach(System.out::println);
        System.out.println(clonedLibrary.getName());
        clonedLibrary.getBooks().stream().forEach(System.out::println);
        System.out.println(deepClonedLibrary.getName());
        deepClonedLibrary.getBooks().stream().forEach(System.out::println);

        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }

}
