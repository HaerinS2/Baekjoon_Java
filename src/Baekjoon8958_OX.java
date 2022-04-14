import java.io.*;

public class Baekjoon8958_OX {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(r.readLine());

        String[] result=new String[size];
        int[] score=new int[size];
        for(int i=0; i<size; i++){
            result[i]=r.readLine();
            String[] strAr=result[i].split("");
            int cnt=0;
            int sum=0;
            for(int j=0; j<strAr.length; j++) {
                if (strAr[j].equals("O")) {
                    sum += ++cnt;
                } else {
                    cnt = 0;
                }
            }
            score[i]=sum;
        }
        for(int i=0; i<score.length; i++){
            System.out.println(score[i]);
        }

    }
}
