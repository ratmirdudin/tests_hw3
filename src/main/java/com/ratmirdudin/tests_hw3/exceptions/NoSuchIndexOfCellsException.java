package com.ratmirdudin.tests_hw3.exceptions;

public class NoSuchIndexOfCellsException extends Exception {
    public NoSuchIndexOfCellsException() {
        this("Exception: Index of cell must be lesser than size of bookList");
    }

    public NoSuchIndexOfCellsException(String message) {
        super(message);
    }
}
