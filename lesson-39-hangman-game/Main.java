import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Hangman game
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        // 从文件读取单词
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    words.add(line.trim().toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        // 避免词库读取失败或文件为空时继续选择随机单词
        if (words.isEmpty()) {
            System.out.println("No words are available");
            return;
        }

        // 获取随机单词
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        // 根据单词长度添加下划线提示
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        // 开始猜测单词
        while (wrongGuesses < 6) {
            System.out.println("Word:");
            System.out.println(getHangmanArt(wrongGuesses));

            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            // 判断字母是否匹配
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess!");

                // 把匹配的位置替换为猜中的字母
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                // 所有下划线都被替换后获胜
                if (!wordState.contains('_')) {
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("You Win!");
                    System.out.println("The word was: " + word);
                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("Wrong Guess!");
            }
        }

        // 错误次数达到 6 次时游戏结束
        if (wrongGuesses >= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Game Over!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    // 根据错误次数显示 Hangman 图形
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """



                    """;
            case 1 -> """
                     o


                    """;
            case 2 -> """
                     o
                     |

                    """;
            case 3 -> """
                     o
                    /|

                    """;
            case 4 -> """
                     o
                    /|\\

                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }
}
