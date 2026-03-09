package homework31026;

public class Book {

    private String title;
    private Author author;
    private int pages;
    private int publishYear;
    private int price;
    private String genre;

    public Book(String title, Author author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}