public class Car {
    String make;
    int year;
    Engine engine;

    Car(String make, int year, String engineType) {
        this.make = make;
        this.year = year;
        // Car 在内部创建并拥有自己的 Engine
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.make + " is running");
    }
}
