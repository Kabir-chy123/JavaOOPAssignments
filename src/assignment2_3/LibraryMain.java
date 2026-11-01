
package assignment2_3;

public class LibraryMain {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Task 1: Add and display books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("Books by Jane Doe:");
        library.findBooksByAuthor("Jane Doe");

        // Task 2: Borrow and return books
        System.out.println("\nBorrowing a book:");

        Book borrowed = library.borrowBook("Java Programming");

        System.out.println("After borrowing:");
        library.displayBooks();

        library.returnBook(borrowed);

        System.out.println("After returning:");
        library.displayBooks();

        // Task 3: Check book availability
        System.out.println("Book availability:");
        System.out.println(library.isBookAvailable("Java Programming"));
        System.out.println(library.isBookAvailable("Python"));

        // Task 4: Ratings and reviews
        book1.setRating(4.5);
        book2.setRating(5.0);
        book3.setRating(4.0);

        book1.addReview("Good book");
        book1.addReview("Easy to understand");
        book2.addReview("Very useful");

        System.out.println("\nBook rating:");
        System.out.println(book1.getRating());

        // Task 5: Library statistics
        System.out.println("\nAverage book rating:");
        System.out.println(library.getAverageBookRating());

        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {
            System.out.println("Most reviewed book: "
                    + mostReviewed.getTitle());
        }

        // Task 6: Library users
        User user1 = new User("Ram", 23);
        User user2 = new User("Sita", 22);

        library.addUser(user1);
        library.addUser(user2);

        user1.borrowBook(library, "Java Programming");
        user2.borrowBook(library, "Data Structures");

        System.out.println("\nLibrary users:");
        library.displayUsers();

        user1.returnBook(library, book1);

        System.out.println("\nFind user:");
        User foundUser = library.findUser("Ram");

        if (foundUser != null) {
            System.out.println(foundUser.getName());
        }

        library.removeUser(user1);

        System.out.println("\nUsers after removal:");
        library.displayUsers();
    }
}


