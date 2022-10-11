import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken(" "));
        long m= Integer.parseInt(st.nextToken(" "));

        System.out.println(difference(n, m));
    }
    public static long difference(long n, long m){
        long diff = (n - m);
        if(diff<0) return (-1)*diff;
        return diff;
    }
}
