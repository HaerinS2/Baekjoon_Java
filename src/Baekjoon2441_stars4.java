import java.io.*;

public class Baekjoon2441_stars4 {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
