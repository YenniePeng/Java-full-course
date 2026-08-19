public class Car {
    // attributes（属性）
    String make = "Toyota";
    String model = "Corolla";
    int year = 2019;
    double price = 7800;
    boolean isRunning = false;

    // methods（对象可以执行的动作）
    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }
}
