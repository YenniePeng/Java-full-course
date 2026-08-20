import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism（运行时多态）：
        // 程序运行时根据对象的实际类型决定执行哪个重写方法
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
