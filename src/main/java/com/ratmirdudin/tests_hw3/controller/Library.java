package com.ratmirdudin.tests_hw3.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ratmirdudin.tests_hw3.exceptions.NoFreeCellsException;
import com.ratmirdudin.tests_hw3.exceptions.NoSuchIndexOfCellsException;
import com.ratmirdudin.tests_hw3.models.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Library {
    private int capacity;
    private List<Book> bookList;

    public Library(int capacity) {
        bookList = new ArrayList<>();
        this.capacity = capacity;
    }

    public void getBook(int numOfCell) throws NoSuchIndexOfCellsException {
        if (numOfCell <= this.bookList.size() - 1) {
            System.out.println(this.bookList.get(numOfCell));
        } else {
            throw new NoSuchIndexOfCellsException();
        }
    }

    public void addBook(Book book) throws NoFreeCellsException {
        if (bookList.size() + 1 <= this.capacity) {
            this.bookList.add(book);
        } else {
            throw new NoFreeCellsException();
        }
    }

    public void addBookList(@NotNull List<Book> bookList) throws NoFreeCellsException {
        if (bookList.size() <= this.capacity) {
            this.setBookList(bookList);
        } else {
            throw new NoFreeCellsException();
        }
    }

    public void printBookList() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();
        System.out.println(gson.toJson(this.bookList));
    }
}
