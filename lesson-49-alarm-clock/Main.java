import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Alarm Clock
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        // 运行前将支持的 WAV 文件放入当前目录并命名为 audio.wav
        String filePath = "audio.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();
                LocalTime parsedTime = LocalTime.parse(inputTime, formatter);

                // 本练习设置当天稍后的时间，避免过去的时间立即触发闹钟
                if (!parsedTime.isAfter(LocalTime.now())) {
                    System.out.println("Please enter a time later than the current time");
                    continue;
                }

                alarmTime = parsedTime;
                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:mm:ss");
            }
        }

        // 后台线程显示时间并等待闹钟触发
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
