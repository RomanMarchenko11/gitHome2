package Files;

import java.io.*;

public class
SaveString {
    /*
    Створити класс з 2 функціями.
    Перша зберігає отриману строку у файл.
    Друга - зчитує дані з файлу та повертає його користувачу
     */
    public static void main(String[] args) {
        saveLine("Good Work! :)");
        System.out.println(getLine());
    }
    private static void saveLine (String line){
        File file = new File("Line.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (OutputStream os = new FileOutputStream(file, false)) {
            byte[] bytes = line.getBytes();
            os.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getLine () {
        File file = new File("Line.txt");
        if (!file.exists()) {
            return "File not exist";
        } else {
            StringBuilder text = new StringBuilder();
            try (InputStream is = new FileInputStream(file)) {
                int ch;
                while ((ch = is.read()) != -1) {
                    text.append((char) ch);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return text.toString();
        }
    }
}
