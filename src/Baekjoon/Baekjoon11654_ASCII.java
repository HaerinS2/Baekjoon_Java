import java.io.*;

public class Baekjoon11654_ASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        System.out.print((int)n.charAt(0));
    }
}
