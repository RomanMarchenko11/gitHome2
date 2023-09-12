package Files.filesNIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;

public class Files {
    public static void main(String[] args) {

        File parentDir = makeDir("filesDir");
        File child = new File(parentDir, "file.txt");
        Path path = Paths.get("filesDir/file.txt");
        try (BufferedReader reader = java.nio.file.Files.newBufferedReader(path)){
            System.out.println("Java NIO");
            byte[] bytes = java.nio.file.Files.readAllBytes(path);
            BasicFileAttributes attrs = java.nio.file.Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Creation Time: " + attrs.creationTime());
            String line =reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        DirectoryStream:
        System.out.println("DirectoryStream");
        Path folderPath = Paths.get("filesDir");
        try (DirectoryStream<Path> directoryStream = java.nio.file.Files.newDirectoryStream(folderPath)) {
            for (Path file : directoryStream) {
                System.out.print(file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File makeDir(String name) {
        File directory = new File(name);
        if (directory.exists()) {
            removeDir(directory);
        }
        if (directory.mkdir()) {
            return directory;
        }
        throw new RuntimeException("'" + name + "' not made!");
    }

    private static void removeDir(File directory) {
        String home = System.getProperty("user.home");
        if (directory.getPath().equals(home)) {
            return;
        }
        if (directory.exists()) {
            File[] dirFiles = directory.listFiles();
            if (dirFiles != null) {
                List<File> files = Arrays.asList(dirFiles);
                files.forEach(Files::deleteFile);
            }
            deleteFile(directory);
        }
    }

    private static void deleteFile(File fileToDelete) {
        fileToDelete.delete();
    }

}
