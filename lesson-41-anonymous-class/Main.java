public class Main {
    public static void main(String[] args) {
        // Anonymous class（匿名类）是没有名字的类，不能在其他地方重复使用
        // 可以在不单独创建新类文件的情况下添加一次性的自定义行为
        // 常用于 TimerTask、Runnable 和 callbacks
        Dog dog1 = new Dog();

        // 创建 Dog 的匿名子类，并只为 dog2 重写 speak()
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Dog says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
