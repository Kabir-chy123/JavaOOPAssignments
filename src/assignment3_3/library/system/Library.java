
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
        if (members.contains(member) && books.contains(book)) {
            books.remove(book);
            member.borrowBook(book);
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
}

