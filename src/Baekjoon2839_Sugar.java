import java.io.*;

public class Baekjoon2839_Sugar {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true){
            if(n%5 == 0){
                bw.write(String.valueOf(n/5 + cnt));
                break;
            } else if(n<=0){
                bw.write(String.valueOf(-1));
                break;
            } else{
                n-=3;
                cnt++;
            }
        }
        br.close();
        bw.close();
    }
}
