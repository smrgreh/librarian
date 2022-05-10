package com.company;

import com.company.interfaces.Administrator;
import com.company.interfaces.Librarian;
import com.company.interfaces.Reader;
import com.company.interfaces.Supplier;

public class AdministratorAndLibrarian extends User implements Administrator, Librarian {
    public AdministratorAndLibrarian(String name) {
        super(name);
    }

    @Override
    public Book findBook(String name) {
        return new Book(name);
    }

    @Override
    public void receive(Book book) {
        System.out.println("Приняли назад книгу : " + name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(reader + " просрочил возврат книги.");
    }

    @Override
    public void order(Supplier supplier, String name) {
        System.out.println("Заказали у " + supplier + " книгу " + name);
    }
}
