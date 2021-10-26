package com.ratmirdudin.junit;

import com.ratmirdudin.tests_hw3.controller.Library;
import com.ratmirdudin.tests_hw3.exceptions.NoFreeCellsException;
import com.ratmirdudin.tests_hw3.models.Book;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {

    //    Библиотека бросает исключение при создании, если ее вместимость меньше чем количество книг, возвращаемое фабрикой.
    @Test(expected = NoFreeCellsException.class)
    public void addBookListThrowNoFreeCellsExceptionWhenCapacityLessThenBookListSizeTest() throws NoFreeCellsException {
        int capacity = 100;
        List<Book> bookList = mock(List.class);
        when(bookList.size()).thenReturn(capacity + 1);

        new Library(capacity).addBookList(bookList);
    }

    //    При создании библиотеки все книги расставлены по ячейкам в порядке как они возвращаются фабрикой книг. Остальные ячейки пусты.
    @Test
    public void Test2() {

    }

    //    При взятии книги информация о ней и ячейке выводится.
    @Test
    public void Tes3t() {

    }

    //    При попытке взять книгу из пустой ячейки библиотека бросает исключение.
    @Test
    public void Test4() {

    }

    //    При взятии книги возвращается именно та книга, что была в этой ячейке.
    @Test
    public void Test5() {

    }

    //    При добавлении книги она размещается в первой свободной ячейке.
    @Test
    public void Test6() {

    }

    //    Если при добавлении книги свободных ячеек нет, библиотека бросает исключение.
    @Test
    public void Test7() {

    }

    //    Вызов метода “напечатать в консоль содержимое” выводит информацию о содержимом ячеек библиотеки.
    @Test
    public void Test8() {

    }


}
