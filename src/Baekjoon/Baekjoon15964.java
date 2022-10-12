import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(hj_math(a, b)));
        bw.flush();
        bw.close();
    }
    public static long hj_math(long a, long b){
        long add = a+b;
        long subtraction = a-b;
        long result=add*subtraction;
        return result;
    }
}
