import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Generics（泛型）把数据类型作为参数
        // 同一份代码可以安全地处理不同类型，并在编译阶段检查类型

        // 泛型类：创建对象时决定 T 的实际类型
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Pizza");

        Box<Integer> numberBox = new Box<>();
        numberBox.setItem(100); // int 自动装箱为 Integer

        System.out.println(stringBox.getItem());
        System.out.println(numberBox.getItem());

        // 多个类型参数：K 表示 key，V 表示 value
        Pair<String, Integer> student = new Pair<>("John", 20);
        System.out.println(student.getKey() + " is " + student.getValue() + " years old");

        // 泛型方法可以接收不同类型的参数
        printItem("Hello");
        printItem(123);
        printItem(3.14);

        String[] foods = {"Pizza", "Noodles", "Salad"};
        System.out.println("First food: " + getFirst(foods));

        // 有界泛型：T 必须是 Number 或 Number 的子类
        NumberBox<Integer> integerBox = new NumberBox<>(10);
        NumberBox<Double> doubleBox = new NumberBox<>(3.14);
        System.out.println(integerBox.getNumber());
        System.out.println(doubleBox.getNumber());

        // 通配符 ? 表示未知类型，可以读取不同类型的列表
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Lucy");

        List<Integer> scores = new ArrayList<>();
        scores.add(90);
        scores.add(95);

        printList(names);
        printList(scores);
    }

    // <T> 写在返回类型前，表示这是一个泛型方法
    static <T> void printItem(T item) {
        System.out.println(item);
    }

    static <T> T getFirst(T[] array) {
        return array[0];
    }

    static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
