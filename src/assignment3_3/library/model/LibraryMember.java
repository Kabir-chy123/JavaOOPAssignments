
package assignment3_3.library.model;

import java.util.ArrayList;

public class LibraryMember {

    private String name;
    private int memberId;

    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean hasBook(Book book) {
        return borrowedBooks.contains(book);
    }

    public void reserveBook(Book book) {
        reservedBooks.add(book);
    }

    public void cancelReservation(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }
}



