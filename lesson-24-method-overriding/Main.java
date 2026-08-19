public class Main {
    public static void main(String[] args) {
        // Method overriding（方法重写）：子类为父类已有的方法提供自己的实现
        // 可以复用父类代码，同时让特定子类拥有不同的行为
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
