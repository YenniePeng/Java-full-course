import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 使用 Java 处理日期和时间
        // LocalDate、LocalTime、LocalDateTime、UTC timestamp

        // 获取当前本地日期和时间
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();

        // 获取当前 UTC 时间戳
//        Instant instant = Instant.now();
//        System.out.println(instant);

        // 使用自定义格式显示日期和时间
//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//        System.out.println(newDateTime);

        // 创建指定日期或日期时间
//        LocalDate date = LocalDate.of(2025, 12, 25);
        LocalDateTime date1 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println(date1);
        System.out.println(date2);

        // 比较两个日期时间
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
