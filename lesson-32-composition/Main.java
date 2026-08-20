public class Main {
    public static void main(String[] args) {
        // Composition（组合）表示对象之间的 part-of 关系
        // 例如，Engine 是 Car 的组成部分
        // 可以使用较小的对象构建更复杂的对象
        Car car = new Car("Toyota", 2019, "V8");

        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
