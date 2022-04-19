import java.io.*;
public class Baekjoon2920_scale {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String scale = br.readLine();
        if(scale.equals("1 2 3 4 5 6 7 8")){
            bw.write("ascending");
        }else if(scale.equals("8 7 6 5 4 3 2 1")){
            bw.write("descending");
        }else{
            bw.write("mixed");
        }
        bw.close();
        br.close();
    }
}
