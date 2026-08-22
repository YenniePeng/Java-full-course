import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enum（Enumeration）是一种表示固定常量集合的特殊类
        // 它可以提高代码的可读性和可靠性
        // 与 String 相比，Enum 配合 switch 使用更安全
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            // valueOf() 把名称完全匹配的 String 转换为 Enum
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            }
        } catch (IllegalArgumentException e) {
            // valueOf() 找不到对应常量时会抛出此异常
            System.out.println("Please enter a valid day");
        }

        scanner.close();
    }
}
