import java.io.*;

public class Baekjoon11721_Cutby10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        for(int i=0; i<word.length(); i++){
            System.out.print(word.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}
