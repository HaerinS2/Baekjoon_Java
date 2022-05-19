package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2490_yutPlay {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] yut = new int[4];
        int cnt;
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                yut[j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
