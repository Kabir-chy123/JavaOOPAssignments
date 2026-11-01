
package assignment2_3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle());
            }
        }
    }

    public Book borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    public void returnBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        double total = 0;

        for (Book book : books) {
            total = total + book.getRating();
        }

        if (books.size() == 0) {
            return 0;
        }

        return total / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.size() == 0) {
            return null;
        }

        Book mostReviewed = books.get(0);

        for (Book book : books) {
            if (book.getReviewCount() > mostReviewed.getReviewCount()) {
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        if (user.getBorrowedBooks().size() == 0) {
            users.remove(user);
        }
    }

    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user.getName());
            user.displayBorrowedBooks();
        }
    }
}




