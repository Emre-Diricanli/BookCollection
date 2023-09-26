public class Book extends Item{

    private int isbnNumber;
    private String author;

    public Book() {
    }

    public Book(String title, int isbnNumber, String author) {
        super(title);
        this.isbnNumber = isbnNumber;
        this.author = author;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getListing() {
        return "Book Name - " + toString() + "\nAuthor - " + getAuthor() + "\nISBN # - " + getIsbnNumber() + "\n";
    }
}
