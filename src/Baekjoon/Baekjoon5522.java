import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}