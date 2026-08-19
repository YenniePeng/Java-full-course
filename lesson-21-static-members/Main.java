public class Main {
    public static void main(String[] args) {
        // static 让变量或方法属于类，而不是某一个特定对象
        // 常用于工具方法或需要由所有对象共享的数据
        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Lucy");
        Friend friend3 = new Friend("Bob");
        Friend friend4 = new Friend("Lily");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.name);
        System.out.println(friend3.numOfFriends);

        // static 成员由所有对象共享，推荐使用类名访问
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
    }
}
