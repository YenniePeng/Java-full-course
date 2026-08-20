public class Main {
    public static void main(String[] args) {
        // Getter 和 setter 可以保护对象数据，并添加读取或修改规则
        // getter：让 private 字段可以被读取
        // setter：让 private 字段可以按照规则被修改
        Car car = new Car("BYD", "Yellow", 200000);

        car.setMake("Toyota");
        car.setColor("Black");
        car.setPrice(100000);

        System.out.println("The " + car.getColor() + " " + car.getMake()
                + "'s price is " + car.getPrice());
    }
}
