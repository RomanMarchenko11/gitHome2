package Files;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Locale;

public class LessonTwentyFive {

    public static void main(String[] args) {
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
//                write to file
                writeToFile("test.txt", "test\ntest\ttest");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String content = readFromFile("test.txt");
        System.out.println(content);

//        simpleReadWriter;
        File simpleFile = new File("simpleReaderWrite.txt");
        if (simpleFile.exists()) {
            System.out.println(simpleReader(simpleFile));
        } else {
            simpleWriter(simpleFile, "test New test\tSimple test");
        }
//        serealization
        serealization();
        deSerealization();
    }

    public static void writeToFile(String filePath, String content) {
        try (OutputStream outputStream = new FileOutputStream(filePath, false)) {
            byte[] bytes = content.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (InputStream inputStream = new FileInputStream(filePath)) {
            int ch;
            while ((ch = inputStream.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    //    те саме, але з використанням вищих класів
    static public void simpleWriter(File file, String content) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public String simpleReader(File file) {
        StringBuilder builder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                builder.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
//    те саме, але з буферизацією для великих файлів - робота не з байтами, а зі строками
    static public void bufferReadFromFile(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferFile.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null);
            System.out.println(line);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    static public void bufferWriterToFile(){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferFile.txt"))) {
            bufferedWriter.write("Line text String");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
// Serialization
    private static void serealization(){
        Student student = new Student("Sergiy", "Nosov", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"))) {
            oos.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static void deSerealization(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"))) {
            Student obj = (Student) ois.readObject();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
