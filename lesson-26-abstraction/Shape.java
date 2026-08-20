public abstract class Shape {
    // 抽象方法没有方法体，普通子类必须实现它
    abstract double area();

    // concrete method（具体方法）有方法体，可以直接被子类继承
    void display() {
        System.out.println("This is a shape");
    }
}
