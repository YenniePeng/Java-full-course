public class Main {
    public static void main(String[] args) {
        // abstract 用于定义抽象类和抽象方法
        // 抽象隐藏实现细节，只展示必要的功能
        // 抽象类不能直接创建对象
        // 抽象类可以包含必须由子类实现的抽象方法
        // 也可以包含能够被子类继承的具体方法
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(3, 5);
        Rectangle rectangle = new Rectangle(4, 5);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
