public class Main {
    public static void main(String[] args) {
        // Object（对象）可以保存数据（attributes）并执行动作（methods）
        // 对象属于引用数据类型（reference data type）
        Car car = new Car();

        // 修改对象的 price 属性
        car.price = 7400;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);
    }
}
