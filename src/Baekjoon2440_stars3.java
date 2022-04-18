import java.io.*;

public class Baekjoon2440_stars3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
