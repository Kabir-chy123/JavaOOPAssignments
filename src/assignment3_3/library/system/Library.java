
package assignment3_3.library.system;

import assignment3_3.library.model.Book;
import assignment3_3.library.model.LibraryMember;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book)
                && (!book.isReserved() || member.hasReservedBook(book))) {

            books.remove(book);
            member.borrowBook(book);

            if (member.hasReservedBook(book)) {
                member.cancelReservation(book);
                book.setReserved(false);
            }

            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Cannot borrow book.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (members.contains(member) && member.hasBook(book)) {
            member.returnBook(book);
            books.add(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Cannot return book.");
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book)
                && !book.isReserved()) {

            book.setReserved(true);
            member.reserveBook(book);
            System.out.println(member.getName() + " reserved " + book.getTitle());
        } else {
            System.out.println("Cannot reserve book.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (members.contains(member) && member.hasReservedBook(book)) {
            member.cancelReservation(book);
            book.setReserved(false);
            System.out.println("Reservation canceled.");
        } else {
            System.out.println("Cannot cancel reservation.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");

        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

