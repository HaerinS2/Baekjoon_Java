package Baekjoon;

import java.io.*;

public class Baekjoon10987_vowels {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String wd = br.readLine();
        String[] wdAr = wd.split("");
        int cnt=0;
        for(int i=0; i<wdAr.length; i++){
            if(wdAr[i].equals("a")||wdAr[i].equals("e")||wdAr[i].equals("i")||wdAr[i].equals("o")||wdAr[i].equals("u")){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
