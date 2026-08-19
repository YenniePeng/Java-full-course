public class Main {
    public static void main(String[] args) {
        // super 表示父类（subclass <- superclass）
        // 常用于构造方法和方法重写
        // 可以调用父类构造方法来初始化继承的属性
        Person person = new Person("Hua", "Li");
        Student student = new Student("Mei", "Zhao", 3.5);
        Employee employee = new Employee("San", "zhang", 50000);

        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();
    }
}
