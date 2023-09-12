package Files.filesNIO;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

public class Buffer {


    public static void main(String[] args) {
byteBufferExamples();
    }


    public static void byteBuffer() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put((byte) 65); //add one byte
        byteBuffer.flip(); // переходимо з режиму запису до режиму читання
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            System.out.println(b);
        }
        byteBuffer.clear(); //clear buffer
        byteBuffer.mark(); //mark current position
//        ....
        byteBuffer.reset(); //return to mark position
    }

    public static void byteBufferExamples() {
        ByteBuffer byteBufferExample = ByteBuffer.allocate(2048);
        byteBufferExample.put((byte) 65);
        byteBufferExample.put((byte) 66);
        byteBufferExample.put((byte) 67);
        byteBufferExample.put((byte) 68);

        byteBufferExample.flip();
        try {
            byteBufferExample.put((byte) 69);
//            byteBufferExample.put((byte) 70);
        } catch (BufferOverflowException e) {
            System.out.println("Caught BufferOverflowException as expected");
        }

        byte first = byteBufferExample.get();
        System.out.println("First element: " + first);

        byteBufferExample.mark();
        byte second = byteBufferExample.get();
        byte third = byteBufferExample.get();

        byteBufferExample.reset();
        byte secondAgain = byteBufferExample.get();
        byte thirdAgain = byteBufferExample.get();

        System.out.printf("First: %d Secong: %d Third: %d; \nagain Second: %d and Third: %d.", first, second, third, secondAgain, thirdAgain);
    }
}
