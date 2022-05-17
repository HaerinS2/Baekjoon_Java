package Baekjoon;

import java.io.*;

public class Baekjoon1550_16Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();
        int dec = Integer.parseInt(hex, 16);
        System.out.println(dec);
    }
}
