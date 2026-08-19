public class Main {
    public static void main(String[] args) {
        // Constructor（构造方法）是初始化对象的特殊方法
        // 创建对象时可以传入参数，为对象的属性设置初始值
        Student student1 = new Student("John", 20, 3.4);
        Student student2 = new Student("Lucy", 30, 3.9);
        Student student3 = new Student("Bob", 25, 2.9);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
