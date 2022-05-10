package com.company;

import com.company.interfaces.Administrator;
import com.company.interfaces.Reader;
import com.company.interfaces.Supplier;

public class SupplierAndReader extends User implements Supplier, Reader {
    public SupplierAndReader(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Поставщик и читатель " + name;
    }
    @Override
    public Book getBook(String name, Administrator administrator) {
        return administrator.findBook(name);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Вернули книгу : " + book);

    }

    @Override
    public Book[] sendBook(String name) {
        System.out.println("Поставили книги: " + name);
        return new Book[]{
                new Book(name),
                new Book(name),
                new Book(name),
        };

        }
    }
