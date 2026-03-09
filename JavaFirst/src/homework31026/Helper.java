package homework31026;

public class Helper {

    public static boolean isLongBook(Book book) {
        return book.getPages() > 400;
    }

    public static int readingTime(Book book) {
        return book.getPages() * 3;
    }

    public static void printBookInfo(Book book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Publish Year: " + book.getPublishYear());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Genre: " + book.getGenre());
    }

    public static Book[] getBooksByAuthor(Book[] books, Author author) {

        int count = 0;

        for (Book book : books) {
            if (book.getAuthor() == author) {
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;

        for (Book book : books) {
            if (book.getAuthor() == author) {
                result[index++] = book;
            }
        }
        return result;
    }
}