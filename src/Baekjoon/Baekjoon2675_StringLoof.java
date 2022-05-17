import java.io.*;

public class Baekjoon2675_StringLoof {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String[] str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            for(byte value : str[1].getBytes()){
                for(int j=0; j<r; j++){
                    sb.append((char)value);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
