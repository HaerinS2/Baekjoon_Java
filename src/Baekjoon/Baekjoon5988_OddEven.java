package Baekjoon;

import java.io.*;

public class Baekjoon5988_OddEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String k = br.readLine();
            sb.append(Integer.parseInt(k.substring(k.length()-1))%2!=0?"odd\n":"even\n");
        }
        System.out.println(sb);
    }
}