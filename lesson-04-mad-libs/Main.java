import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.print("Enter an adjective (emotion): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter a verb (+ing): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter an adjective (emotion): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nYesterday, I went to the local zoo. I felt so " + adjective1 + ";");
        System.out.println("Because I saw my favourite animal, " + noun1 + ";");
        System.out.println("At that time " + noun1 + " was " + verb1 + ". It was very " + adjective2 + ".");
        System.out.println("That was a " + adjective3 + " day for me!");

        scanner.close();
    }
}
