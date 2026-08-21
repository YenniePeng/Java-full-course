import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Java 常见的文件读写方式
        // FileWriter：适合写入中小型文本文件
        // BufferedWriter：写入大量文本时性能更好
        // BufferedReader + FileReader：适合逐行读取文本文件
        // RandomAccessFile：适合读写大型文件中的指定位置

        // 相对路径表示读取当前运行目录中的 test.txt
        String filePath = "test.txt";

        // try-with-resources 会在读取结束后自动关闭 BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // readLine() 读取一行；到达文件末尾时返回 null
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
