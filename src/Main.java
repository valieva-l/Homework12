public class Main {

    public static void main(String[] args) {
        Author detectiveAuthor = new Author("Артур", "Конан Дойл");
        Author fantasyAuthor = new Author("Макс", "Фрай");
        Book detectiveBook = new Book("Собака Баскервилей", 1901, detectiveAuthor);

        System.out.println("detectiveAuthor.name = " + detectiveAuthor.getAuthorName() + " " + detectiveAuthor.getAuthorSurname());
        System.out.println("detectiveBook.title = " + detectiveBook.getTitle());
        System.out.println("detectiveBook.Year = " + detectiveBook.getYear());
        detectiveBook.setYear(1902);
        System.out.println("detectiveBook.getYear() = " + detectiveBook.getYear());

        Book fantasyBook = new Book("Чужак", 1996, fantasyAuthor);
        System.out.println("fantasyAuthor.getAuthorName = " + fantasyAuthor.getAuthorName() + " " + fantasyAuthor.getAuthorSurname());
        System.out.println("fantasyBook.title = " + fantasyBook.getTitle());
        System.out.println("fantasyBook.Year = " + fantasyBook.getYear());


    }
}