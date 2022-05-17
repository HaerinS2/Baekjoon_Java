package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon4101_Big {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            String s = a>b?"Yes":"No";
            System.out.println(s);
        }
    }
}
