import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        try {
            // 当前时间早于 alarmTime 时，每秒更新一次时间
            while (LocalTime.now().isBefore(alarmTime)) {
                try {
                    Thread.sleep(1000);

                    LocalTime now = LocalTime.now();
                    int hours = now.getHour();
                    int minutes = now.getMinute();
                    int seconds = now.getSecond();

                    System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
                } catch (InterruptedException e) {
                    System.out.println("\nAlarm thread was interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            System.out.println("\n*Alarm Noises*");
            playSound(filePath);
        } finally {
            scanner.close();
        }
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);
        Clip clip = null;

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Press Enter to stop the alarm");
            scanner.nextLine();

            clip.stop();
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate audio file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Could not read audio file");
        } finally {
            if (clip != null) {
                clip.close();
            }
        }
    }
}
