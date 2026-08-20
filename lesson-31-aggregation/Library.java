public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayinfo() {
        System.out.println("The " + this.name + " was established in " + this.year);
        System.out.println("Books available: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
