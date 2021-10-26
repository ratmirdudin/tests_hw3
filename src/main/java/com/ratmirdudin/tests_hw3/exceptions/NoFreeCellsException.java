package com.ratmirdudin.tests_hw3.exceptions;

public class NoFreeCellsException extends Exception {
    public NoFreeCellsException() {
        this("Exception: Capacity must be bigger than size of added bookList");
    }

    public NoFreeCellsException(String message) {
        super(message);
    }
}
