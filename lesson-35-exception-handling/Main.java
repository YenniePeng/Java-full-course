import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception（异常）是中断程序正常流程的事件
        // 例如：除以零、找不到文件、输入类型不匹配
        // 可以把可能出现异常的代码放进 try，并使用 catch 处理异常
        // finally 中的代码通常无论是否发生异常都会执行

        // try-with-resources 会在使用结束后自动关闭 Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number");
        } catch (ArithmeticException e) {
            // 当前示例没有除法，这个分支用于展示其他异常的处理方式
            System.out.println("You CAN'T divide by zero");
        } catch (Exception e) {
            // Safety net：捕获前面没有处理的其他异常
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This always executes");
        }
    }
}
