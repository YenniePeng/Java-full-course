import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Rock Paper Scissors Game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // 获取玩家的选择
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            // 检查选择是否有效
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                // 跳过本轮后面的代码，重新开始循环
                continue;
            }

            // 让电脑随机选择
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // 判断胜负
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // 询问是否继续游戏
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
