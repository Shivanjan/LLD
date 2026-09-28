import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {

    private Map<Book, Integer> inventory;

    public LibraryManagement() {
        inventory = new HashMap<>();
    }

    // Librarian operations

    public void addBook(Book book, int quantity) {

        inventory.put(
            book,
            inventory.getOrDefault(book, 0) + quantity
        );
    }

    public void removeBook(Book book, int quantity) {

        if (!inventory.containsKey(book)) {
            System.out.println("Book not found.");
            return;
        }

        int currentQuantity = inventory.get(book);

        if (currentQuantity < quantity) {
            System.out.println("Not enough copies.");
            return;
        }

        inventory.put(book, currentQuantity - quantity);
    }

    // Issue book

    public boolean issueBook(Member member, Book book) {

        if (member.isBlocked()) {
            System.out.println("Member is blocked.");
            return false;
        }

        int available = inventory.getOrDefault(book, 0);

        if (available <= 0) {
            System.out.println("Book is not available.");
            return false;
        }

        inventory.put(book, available - 1);

        member.borrowBook(book);

        System.out.println("Book issued successfully.");

        return true;
    }

    // Return book

    public int returnBook(Member member,
                           Book book,
                           int daysBorrowed) {

        if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("This book was not issued to this member.");
            return 0;
        }

        member.returnBook(book);

        int available = inventory.getOrDefault(book, 0);
        inventory.put(book, available + 1);

        int allowedDays = 14;
        int finePerDay = 5;

        int fine = 0;

        if (daysBorrowed > allowedDays) {
            fine = (daysBorrowed - allowedDays) * finePerDay;
        }
        member.totalFines += fine;
        System.out.println("Book returned.");
        System.out.println("Fine: " + member.totalFines);

        return fine;
    }
}