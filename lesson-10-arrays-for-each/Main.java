import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods;

        System.out.print("What # of food do you want?: ");
        int size = scanner.nextInt();

        // 清除 nextInt() 留下的换行符
        scanner.nextLine();
        foods = new String[size];

        // 普通 for 循环：通过索引给数组赋值
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        // enhanced for loop：依次读取数组中的元素
        for (String food : foods) {
            System.out.print(food + " ");
        }
        System.out.println();

        scanner.close();
    }
}
