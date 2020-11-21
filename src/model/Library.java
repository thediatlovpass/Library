package model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINES = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber;
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int magazinesNumber;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maxymalna liczba książek została osiągnięta");
        }

    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

    public void addMagazines(Magazine magazine) {
        if (magazinesNumber < MAX_MAGAZINES) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("Maxymalna liczba magazynów została osiągnięta");
        }

    }

    public void printMagazines() {
        if (magazinesNumber == 0) {
            System.out.println("Brak Magazynów w bibliotece");
        }
        for (int i = 0; i < magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }

}
