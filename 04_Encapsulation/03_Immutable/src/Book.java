public class Book {
    private final String bookName;
    private final String author;
    private final int pagesCount;
    private final int ISBN;

    public Book(String bookName, String author, int pagesCount, int ISBN) {
        this.bookName = bookName;
        this.author = author;
        this.pagesCount = pagesCount;
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getISBN() {
        return ISBN;
    }
}
