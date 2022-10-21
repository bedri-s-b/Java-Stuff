import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StreamInput {
    public static void main(String[] args) {

        // reading from input stream

        try (FileInputStream fileInputStream = new FileInputStream("//some real path")) {
            int singleByte = fileInputStream.read();
            while (singleByte >= 0) {
                System.out.println(Integer.toBinaryString(singleByte));
                System.out.println(((char) singleByte));
                singleByte = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
