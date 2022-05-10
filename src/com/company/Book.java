package com.company;

import com.company.interfaces.Administrator;
import com.company.interfaces.Reader;

public class Book implements Administrator {
    private String name;

    public Book(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public Book findBook(String name) {
        return null;
    }

    @Override
    public void overdueNotification(Reader reader) {

    }

    @Override
    public void receive(Book book) {

    }
}


