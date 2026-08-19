import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java slot machine
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍇 🍋 🫐 🥑 ");
        System.out.println("*************************");

        // 余额大于 0 时可以继续游戏
        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter your bet amount: ");
            bet = scanner.nextInt();

            // 清除 nextInt() 留下的换行符
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                // 从余额中扣除下注金额
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

            payout = getPayout(row, bet);
            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry, you lost this round");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("GAME OVER! Your final balance is $" + balance);
        scanner.close();
    }

    // 随机生成一行三个符号
    static String[] spinRow() {
        String[] symbols = {"🍒", "🍇", "🍋", "🫐", "🥑"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // 显示本轮结果
    static void printRow(String[] row) {
        System.out.println("*************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*************");
    }

    // 根据相同符号的数量和种类计算奖金
    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍇" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🫐" -> bet * 10;
                case "🥑" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍇" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🫐" -> bet * 5;
                case "🥑" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍇" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🫐" -> bet * 5;
                case "🥑" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
