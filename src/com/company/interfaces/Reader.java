package com.company.interfaces;

import com.company.Book;

public interface Reader {

    Book getBook(String name, Administrator administrator);
    void returnBook(Book book);

}
