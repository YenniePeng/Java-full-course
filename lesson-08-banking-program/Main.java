import java.util.Scanner;

public class Main {
    // 多个方法共用同一个 Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*************************");
            System.out.println("Banking Program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day! 😀");
        System.out.println("***************************");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("**************");
        System.out.printf("$%.2f%n", balance);
    }

    static double deposit() {
        System.out.print("Enter an amount to be deposited: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }

    static double withdraw(double balance) {
        System.out.print("Enter amount to be withdrawn: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }
}
