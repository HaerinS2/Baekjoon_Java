package Baekjoon;

import java.io.*;

public class Baekjoon13752_Histogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            for(int j=0; j<k; j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
