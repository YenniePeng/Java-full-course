import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // nextInt() 后清除残留的换行符
        scanner.nextLine();

        System.out.print("Your favourite color is: ");
        String color = scanner.nextLine();

        System.out.print("Enter your gender: ");
        char gender = scanner.next().charAt(0);

        System.out.print("My GPA is: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("My name is " + name);
        System.out.println("My age is " + age + " years old");
        System.out.println("My favourite color is " + color);
        System.out.println("My gender is " + gender);
        System.out.println("My GPA is " + gpa);

        if (isStudent) {
            System.out.println("Congrats! You are enrolled as a student");
        } else {
            System.out.println("Sorry, you are NOT enrolled");
        }

        scanner.close();
    }
}
