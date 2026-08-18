import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 在 int 数组中查找数字
//        int[] numbers = {1, 4, 2, 6, 3, 7, 9, 0};
//        int target = 4;
//        boolean isFound = false;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (target == numbers[i]) {
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if (!isFound) {
//            System.out.println("Can't find the element");
//        }

        // 在 String 数组中查找水果
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            // String 的内容比较使用 equals()，不能使用 ==
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Can't find the element");
        }

        scanner.close();
    }
}
