package model;

public class Book extends Publication{
    // Pola
    private String author;
    private int pages;
    private String isbn;

    // Konstruktor


    public Book(int year, String title, String publisher, String author, int pages, String isbn) {
        this.setYear(year);
        this.setTitle(title);
        this.setPublisher(publisher);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    // settery i gettery

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        String info = getYear() + "; " + getTitle() + "; " + getPublisher() + "; "
                + author + "; " + pages +"; " + isbn;
        System.out.println(info);
    }
}