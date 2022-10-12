import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String beforeWord = br.readLine();
        String afterWord = "";
        int temp;
        for(int i=0; i<beforeWord.length(); i++){
            temp = (int)beforeWord.charAt(i);
            if(65<=temp && temp<=90){
                afterWord += (char)(temp+32);
            } else if(94<=temp && temp<=122) {
                afterWord += (char)(temp-32);
            }
        }
        bw.write(afterWord);

        bw.flush();
        bw.close();
    }
}