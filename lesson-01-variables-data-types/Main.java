public class Main {
    public static void main(String[] args) {
        // primitive types（基本数据类型）
        int age = 29;
        double price = 20;
        boolean isChildren = true;
        char grade = 'A';
        char currency = '$';

        // reference type（引用类型）
        String name = "Xian";
        String food = "Pizza";
        String email = "xian1230@gmail.com";
        String color = "yellow";

        if (isChildren) {
            System.out.println("Her name is " + name);
        } else {
            System.out.println("Her age is " + age);
        }

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("Your choice is " + food + " " + grade + " " + color);
        System.out.println("Price: " + currency + price);
        System.out.println("Email: " + email);
    }
}
