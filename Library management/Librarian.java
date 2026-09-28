public class Librarian {

    private String librarianId;
    private String name;

    public Librarian(String librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
    }

    public String getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public void addBook(LibraryManagement library,
                        Book book,
                        int quantity) {

        library.addBook(book, quantity);
    }

    public void removeBook(LibraryManagement library,
                           Book book,
                           int quantity) {

        library.removeBook(book, quantity);
    }

    public void blockMember(Member member) {
        member.block();
    }

    public void unblockMember(Member member) {
        member.unblock();
    }
}