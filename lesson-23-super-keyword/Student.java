public class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa) {
        // this.first = first;
        // this.last = last;
        // 使用 super 调用 Person 的构造方法
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s GPA is " + this.gpa);
    }
}
