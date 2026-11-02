
package assignment3_3;

import assignment3_3.library.model.Book;
import assignment3_3.library.model.LibraryMember;
import assignment3_3.library.system.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Basics", "John", "123");
        Book book2 = new Book("Python Basics", "David", "456");

        LibraryMember member1 = new LibraryMember("Ram", 1);
        LibraryMember member2 = new LibraryMember("Sita", 2);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        library.returnBook(member1, book1);
    }
}
