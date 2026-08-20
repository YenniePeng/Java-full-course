public class Main {
    public static void main(String[] args) {
        // Aggregation（聚合）表示对象之间的 has-a 关系
        // 一个对象的结构中包含其他对象
        // 被包含的对象也可以脱离容器对象独立存在
        Book book1 = new Book("Harry Potter ", 618);
        Book book2 = new Book("PRIDE AND PREJUDICE", 424);
        Book book3 = new Book("Stories from Shakespeare", 586);

        Book[] books = {book1, book2, book3};
        Library library = new Library("Sichuan Provincial Library", 1912, books);
        library.displayinfo();

//        for (Book book : books) {
//            System.out.println(book.displayInfo());
//        }
//        System.out.println(book1.displayInfo());
//        System.out.println(book2.displayInfo());
//        System.out.println(book3.displayInfo());
    }
}
