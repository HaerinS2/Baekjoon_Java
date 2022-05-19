package Baekjoon;

import java.io.*;

public class Baekjoon10886_Cute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int yes=0;
        int no=0;
        for(int i=0; i<n; i++){
            int k=Integer.parseInt(br.readLine());
            if(k==0){
                no++;
            } else{
                yes++;
            }
        }
        if(yes>no){
            System.out.println("Junhee is cute!");
        } else{
            System.out.println("Junhee is not cute!");
        }
    }
}
