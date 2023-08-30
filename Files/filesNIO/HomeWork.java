package Files.filesNIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Files;

public class HomeWork {
    /*
    Створити класс з 2 функціями.
    Перша зберігає отриману строку у файл.
    Друга - зчитує дані з файлу та повертає його користувачу
     */
    public static void main(String[] args) {

        saveToFile("Good Morning! Where is the hope?");
        readFromFile();
    }

    public static void saveToFile(String line) {
        Path path = Paths.get("LineFile.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.writeString(path, line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        Path path = Paths.get("LineFile.txt");
        if (Files.exists(path)) {
            try {
                byte[] line = Files.readAllBytes(path);
                System.out.println(new String(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File is not exists");
        }
    }
}
