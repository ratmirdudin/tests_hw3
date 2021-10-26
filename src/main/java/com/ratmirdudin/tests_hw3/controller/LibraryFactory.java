package com.ratmirdudin.tests_hw3.controller;

import com.ratmirdudin.tests_hw3.exceptions.NoFreeCellsException;
import com.ratmirdudin.tests_hw3.exceptions.NoSuchIndexOfCellsException;
import com.ratmirdudin.tests_hw3.models.Author;
import com.ratmirdudin.tests_hw3.models.Book;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LibraryFactory {
    @NotNull
    public Library createLibrary(String filePath, int capacity) {
        List<Book> newBookList;

        Library library = new Library(capacity);


        newBookList = new BooksFactory(filePath).createBookList();

        try {
            library.addBookList(newBookList);
            library.addBook(new Book(new Author("Ratmir"), "Ratmirs Book"));
        } catch (NoFreeCellsException e) {
            e.printStackTrace();
            return new Library();
        }

        return library;
    }
}
