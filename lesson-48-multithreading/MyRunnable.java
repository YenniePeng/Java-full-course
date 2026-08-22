public class MyRunnable implements Runnable {
    private final String text;

    MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                // 只暂停当前正在执行的工作线程 1 秒
                Thread.sleep(1000);
//                System.out.println(i);
//                System.out.println(Thread.currentThread().getName() + " " + i);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
