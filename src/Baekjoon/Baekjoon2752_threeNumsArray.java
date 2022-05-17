package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2752_threeNumsArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ar = new int[3];
        for(int i=0; i<3; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        int j, tmp;
        for(int i=0; i<ar.length-1; i++){
            j = i;
            while (j>=0 && ar[j] > ar[j+1]){
                tmp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = tmp;
                j--;
            }
        }
        for(int i=0; i<ar.length; i++){
            System.out. print(ar[i] + " ");
        }
    }
}
