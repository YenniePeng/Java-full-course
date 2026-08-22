public class Main {
    public static void main(String[] args) {
        // Multithreading（多线程）允许程序同时运行多个线程
        // Thread 是一组能够独立运行的指令
        // 适合后台任务或耗时操作

//        MyRunnable myRunnable = new MyRunnable("PING");

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("Game Start");

        thread1.start();
        thread2.start();

        // 两个线程并发执行，因此 PING 和 PONG 的输出顺序不固定
        // join() 让当前主线程等待另一个线程完成
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        // 两个工作线程结束后才执行
        System.out.println("Game Over");
    }
}
