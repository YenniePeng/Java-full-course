public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 后台线程独立计时，不阻塞主线程读取输入
        for (int i = 1; i <= 10; i++) {
            try {
                // 暂停当前后台线程 1 秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                // 恢复中断状态并结束后台任务
                Thread.currentThread().interrupt();
                return;
            }

            if (i == 10) {
                System.out.println("Time's up!");
                // 立即结束整个 Java 程序
                System.exit(0);
            }
        }
    }
}
