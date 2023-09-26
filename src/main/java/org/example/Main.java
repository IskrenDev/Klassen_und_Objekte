package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", "Iskren Radev", "12345678");
        Book book2 = new Book("Java Advanced", "Fabian Link", "87654321");

        Book[] books = {book1, book2};

        Library library1 = new Library(books);

        System.out.println(library1);
    }

}