package homework31026;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Rowling", 1965);
        Author author2 = new Author("Raffi", 1903);

        Book book1 = new Book("Harry Potter 1", author1, 1997);
        book1.setPages(350);
        book1.setPrice(20);
        book1.setGenre("Fantasy");

        Book book2 = new Book("Harry Potter 2", author1, 1998);
        book2.setPages(420);

        Book book3 = new Book("Harry Potter 3", author1, 1999);
        book3.setPages(450);

        Book book4 = new Book("Samvel", author2, 1949);

        Book book5 = new Book("Xenty", author2, 1945);

        Book book6 = new Book("Davit Bek", author2, 1938);

        Book[] books = {book1, book2, book3, book4, book5, book6};

        Helper.printBookInfo(book1);

        System.out.println("Reading time: " + Helper.readingTime(book1));

        System.out.println("Is long book: " + Helper.isLongBook(book3));

        Book[] authorBooks = Helper.getBooksByAuthor(books, author1);

        System.out.println("Books by " + author1.getName());

        for (Book book : authorBooks) {
            System.out.println(book.getTitle());
        }

        Book[] authorBooks2 = Helper.getBooksByAuthor(books, author2);

        System.out.println("Books by " + author2.getName());

        for (Book book : authorBooks2) {
            System.out.println(book.getTitle());
        }
    }
}