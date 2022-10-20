import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamOutput {
    public static void main(String[] args) {
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("outFileTest.txt"); // create file, in this case into local directory
            PrintWriter writer = new PrintWriter(fileOutputStream);

            FileInputStream fileInputStream = new FileInputStream("//some real path");

            int singleBite = fileInputStream.read();

            while (singleBite != -1) {
                writer.print((char) singleBite);
                singleBite = fileInputStream.read();
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
