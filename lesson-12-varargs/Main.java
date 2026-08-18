public class Main {
    public static void main(String[] args) {
        // varargs 允许方法接收数量不固定的参数
        // Java 会把这些参数自动打包成数组，让方法更灵活
        // int... 或 double... 中的 ... 叫作 ellipsis（省略号）

        System.out.println(add(1, 2, 3));
        System.out.println(average(1, 2, 3));
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;

        // 没有传入数字时，避免除以 0
        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
