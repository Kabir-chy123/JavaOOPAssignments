
package assignment2_3;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Library library, String title) {
        Book book = library.borrowBook(title);

        if (book != null) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + title);
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(Library library, Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            library.returnBook(book);
            System.out.println(name + " returned " + book.getTitle());
        }
    }

    public void displayBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println("Borrowed: " + book.getTitle());
        }
    }
}

