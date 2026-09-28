public class Main {

    public static void main(String[] args) {

        LibraryManagement library = new LibraryManagement();

        Librarian librarian =
                new Librarian("L01", "John");

        Member member =
                new Member("M01", "Shivanjan");

        Book book =
                new Book("B01", "Clean Code", "Robert Martin");

        Book book1 =
                new Book("B02", "Design Patterns", "Gang of Four");

        librarian.addBook(library, book, 5);

        library.issueBook(member, book);

        int fine = library.returnBook(
                member,
                book,
                20
        );
        library.issueBook(member, book1);

        library.returnBook(member, book1, 20);

        System.out.println("Final fine = " + member.totalFines);
    }
}