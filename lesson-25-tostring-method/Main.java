public class Main {
    public static void main(String[] args) {
        // toString() 是从 Object 类继承的方法
        // 用于返回对象的字符串表示
        // 默认格式通常是：类名@哈希码的十六进制形式
        // 可以重写该方法，让对象显示更有意义的信息
        Car car1 = new Car("Toyota", "Corolla", 2019, "White");
        Car car2 = new Car("Ford", "Mustang", 2020, "Red");

        // println() 会自动调用对象的 toString()
        System.out.println(car1);
        System.out.println(car2);
    }
}
