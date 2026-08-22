import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Threading（多线程）允许程序同时运行多个任务
        // 适用于文件 I/O、网络通信或其他后台任务

        // 创建线程的常见方式：
        // 1. 继承 Thread 类（较简单）
        // 2. 实现 Runnable 接口（职责更清晰，通常更推荐）
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        // 必须在 start() 前设置守护线程
        // 所有普通线程结束后，JVM 不会等待守护线程完成
        thread.setDaemon(true);

        // start() 创建新线程并执行 run()；直接调用 run() 不会创建新线程
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
