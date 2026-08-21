import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer 用于在指定时间或按照固定周期安排任务
        // 适合发送通知、定时更新和重复执行任务

        // TimerTask 表示将由 Timer 执行的任务
        // 可以继承 TimerTask，并重写 run() 定义任务内容
        Timer timer = new Timer();

        // 使用匿名类创建一次性的 TimerTask
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;

                if (count <= 0) {
                    System.out.println("Task complete!");
                    timer.cancel();
                }
            }
        };

        // delay = 1000 毫秒：一秒后首次执行
        // period = 1000 毫秒：之后每隔一秒执行一次
        timer.schedule(task, 1000, 1000);
    }
}
