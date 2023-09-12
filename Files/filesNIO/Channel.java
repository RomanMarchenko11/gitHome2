package Files.filesNIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channel {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
             FileChannel fileChannel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int bytesRead = fileChannel.read(buffer);
            while (bytesRead != -1) {
                buffer.flip();
                while ((buffer.hasRemaining())) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                bytesRead = fileChannel.read(buffer);
            }
        }
    }
}
