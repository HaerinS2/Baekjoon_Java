import java.io.*;
import java.util.*;

public class Baekjoon4344_AboveAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] ar;
        int size = Integer.parseInt(r.readLine());
        StringTokenizer s;
        for(int i=0; i<size; i++){
            s = new StringTokenizer(r.readLine(), " ");
            int n=Integer.parseInt(s.nextToken());//학생 수
            ar = new int[n];
            double sum=0;
            for(int j=0; j<ar.length; j++){
              int scores=Integer.parseInt(s.nextToken());
              ar[j]=scores;
              sum+=scores;
            }
            double avg = sum/n;
            double cnt = 0;
            for(int j=0; j<ar.length; j++){
                if(ar[j]>avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
    }
}
