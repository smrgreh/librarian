package com.company;

import com.company.interfaces.Administrator;
import com.company.interfaces.Reader;


public class ReaderIn extends User implements Reader {


    public ReaderIn(String name) {
        super(name);
    }

    @Override
    public Book getBook(String name, Administrator administrator) {
        System.out.println("Берем из библиотеки и читаем книгу: " + name);
        return administrator.findBook(name);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Вернули книгу : " + book);

    }
    @Override
    public String toString() {
        return "Читатель " + name;

    }
}
