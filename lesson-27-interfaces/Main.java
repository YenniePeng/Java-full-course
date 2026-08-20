public class Main {
    public static void main(String[] args) {
        // Interface（接口）是类的行为蓝图，可以声明一组抽象方法
        // 实现接口的类必须定义这些方法
        // 一个类可以实现多个接口，获得类似多重继承的行为
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
