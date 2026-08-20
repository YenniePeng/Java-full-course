public class Main {
    public static void main(String[] args) {
        // Polymorphism（多态）：poly 表示 many，morph 表示 shape
        // 不同的子类对象可以被当作共同父类类型使用
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

//        car.go();
//        bike.go();
//        boat.go();

        // Vehicle 数组可以保存不同的 Vehicle 子类对象
        Vehicle[] vehicles = {car, bike, boat};

        // 实际执行哪个 go()，取决于 vehicle 指向的实际对象
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
