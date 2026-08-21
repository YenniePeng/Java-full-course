import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 使用 FileWriter 写入文本文件
        // 相对路径会在程序当前运行目录中创建 test.txt
        String filePath = "test.txt";
        String textContent = """
                Hello world!
                This is a new way
                Just try your best
                Trust yourself!
                """;

        // try-with-resources 会在写入结束后自动关闭 FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
