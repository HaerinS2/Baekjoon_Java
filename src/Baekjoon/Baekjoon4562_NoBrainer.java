package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon4562_NoBrainer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x, y;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            String s = x>=y?"MMM BRAINS":"NO BRAINS";
            System.out.println(s);
        }
    }
}
