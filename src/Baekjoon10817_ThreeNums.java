import java.io.*;
import java.util.*;

public class Baekjoon10817_ThreeNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] xyz = new int[3];
        for(int i=0; i<3; i++){
            xyz[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xyz);
        System.out.println(xyz[1]);
    }
}
