package com.ratmirdudin.tests_hw3.controller;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.ratmirdudin.tests_hw3.models.Book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BooksFactory {
    private static final Type listBooksType = new TypeToken<ArrayList<Book>>() {
    }.getType();
    private final String filePath;

    public BooksFactory(String filePath) {
        this.filePath = filePath;
    }

    public List<Book> createBookList() {
        try {
            return new Gson().fromJson(new BufferedReader(new FileReader(this.filePath)), listBooksType);
        } catch (
                FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
