import java.io.*;
import java.util.*;

public class Baekjoon10951_APlusB4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a+b;

            bw.write(result + "");
            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
