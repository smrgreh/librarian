package com.company;

import com.company.interfaces.Administrator;
import com.company.interfaces.Librarian;
import com.company.interfaces.Reader;
import com.company.interfaces.Supplier;

public class Main {

    public static void main(String[] args) {
        AdministratorAndLibrarian anna = new AdministratorAndLibrarian("Анна");
        Reader maria = new ReaderIn("Мария");
        Supplier sergey = new SupplierAndReader("Сергей");


        Book targetBook = maria.getBook("Fire & Water", anna);
        anna.overdueNotification(maria);
        maria.returnBook(targetBook);

        anna.order(sergey, "With love, Mary!");
        sergey.sendBook("With love, Mary!");


    }
}
