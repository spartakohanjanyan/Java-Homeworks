package homework22726;

public class BookClass {
    public static void main(String[] args){
        Book book1 = new Book("Xenty", "Raffi", 1880);
        book1.displayInfo();

    }
}

class Book {
    String title;
    String author;
    int yearPublished;

     Book(String title1, String author1, int yearPublished1) {
        title = title1;
        author = author1;
        yearPublished = yearPublished1;
    }

     void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

}

