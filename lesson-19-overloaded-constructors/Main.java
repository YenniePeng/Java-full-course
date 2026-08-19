public class Main {
    public static void main(String[] args) {
        // Overloaded constructors（构造方法重载）允许一个类拥有多个构造方法
        // 每个构造方法使用不同的参数列表，让对象可以用不同方式初始化
        User user1 = new User();
        User user2 = new User("John");
        User user3 = new User("Lucy", "lucy123@gmail.com");
        User user4 = new User("Bob", "bob123@gmail.com", 22);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
