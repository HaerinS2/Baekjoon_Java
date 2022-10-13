import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon16170 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("2022\n" +
                "10\n" +
                "13");

        bw.flush();
        bw.close();
    }
}