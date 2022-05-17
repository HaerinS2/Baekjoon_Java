import java.io.*;
import java.util.HashSet;

public class Baekjoon3052_Remainder{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<10; i++){
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.print(hs.size());
    }
}