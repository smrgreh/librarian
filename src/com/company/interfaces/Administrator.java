package com.company.interfaces;

import com.company.Book;

public interface Administrator {

    Book findBook(String name);

    void overdueNotification(Reader reader);

    void receive(Book book);


}
