public abstract class Vehicle {
    abstract void go();

    // Vehicle 也可以改成 interface：
    // public interface Vehicle { void go(); }
    // 此时 Car、Bike、Boat 要把 extends Vehicle 改为 implements Vehicle，
    // 并将各自的 go() 方法声明为 public。
}
