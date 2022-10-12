import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String jae = br.readLine();
        String doc = br.readLine();
        int cnt1=0;
        int cnt2=0;

        for(int i=0; i<jae.length(); i++){
            if(jae.charAt(i)=='a'){
                cnt1++;
            }
        }
        for(int i=0; i<doc.length(); i++){
            if(doc.charAt(i)=='a'){
                cnt2++;
            }
        }
        if(cnt1<cnt2){
            bw.write("no");
        } else if(cnt2<=cnt1){
            bw.write("go");
        }

        bw.flush();
        bw.close();
    }
}