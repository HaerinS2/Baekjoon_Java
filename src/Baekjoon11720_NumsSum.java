import java.io.*;

public class Baekjoon11720_NumsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(byte value : br.readLine().getBytes()){
            sum += (value-'0');
        }
        System.out.print(sum);
    }
}
