import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList 是可以动态调整大小的数组结构
        // 普通数组长度固定，而 ArrayList 可以继续添加或删除元素
        // ArrayList 存储对象；基本类型需要通过包装类和自动装箱使用

        // Double 包装类与 autoboxing 示例
//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(3.1);
//        list.add(2.2);
//        list.add(1.0);
//        System.out.println(list);

        // ArrayList 常用方法：add、remove、set、get、size 和 sort
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Coconut");
//
//        fruits.remove(1);
//        fruits.set(0, "Pineapple");
//
//        System.out.println(fruits.get(2));
//        System.out.println(fruits.size());
//        Collections.sort(fruits);
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//        System.out.println(fruits);

        // 根据用户输入动态添加食物
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        // 清除 nextInt() 留下的换行符
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
        scanner.close();
    }
}
