public class Main {
    public static void main(String[] args) {
        // Array of objects（对象数组）
        Car car1 = new Car("Corolla", "white");
        Car car2 = new Car("Corvette", "blue");
        Car car3 = new Car("Mustang", "yellow");

        // 也可以把已有对象放进数组：Car[] cars = {car1, car2, car3};
        // 这里使用 new 创建了三个新对象，与上面的 car1、car2、car3 不同
        Car[] cars = {
                new Car("Corolla", "white"),
                new Car("Corvette", "blue"),
                new Car("Mustang", "yellow")
        };

        // 修改数组中每个 Car 对象的颜色
        for (Car car : cars) {
            car.color = "red";
        }

        for (Car car : cars) {
            car.drive();
        }

        // car1、car2、car3 没有放入 cars 数组，所以仍保留原来的颜色
        System.out.println(car1.model);
        System.out.println(car1.color);
        car1.drive();

        System.out.println(car2.model);
        System.out.println(car2.color);
        car2.drive();

        System.out.println(car3.model);
        System.out.println(car3.color);
        car3.drive();
    }
}
