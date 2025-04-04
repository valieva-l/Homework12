public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;

    }

    public String getTitle() {
        return this.title;

    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;

    }

}
