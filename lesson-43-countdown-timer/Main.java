import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer 用于在指定时间或按照固定周期安排任务
        // TimerTask 表示将由 Timer 执行的任务
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();
        scanner.close();

        // 防止从 0 或负数开始后，倒计时永远无法等于 0
        if (response <= 0) {
            System.out.println("Countdown must be greater than 0");
            return;
        }

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if (count == 0) {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        // 立即开始，并尽量保持每 1000 毫秒执行一次
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
