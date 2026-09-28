import java.util.HashSet;
import java.util.Set;

public class Member {

    private String memberId;
    private String name;
    private boolean blocked;
    public  int totalFines;

    private Set<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.blocked = false;
        this.totalFines = 0;
        this.borrowedBooks = new HashSet<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void block() {
        blocked = true;
    }

    public void unblock() {
        blocked = false;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}