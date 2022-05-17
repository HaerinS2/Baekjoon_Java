import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1546_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s;
        int n=Integer.parseInt(r.readLine());
        float[] a=new float[n];
        s = new StringTokenizer(r.readLine());
        float res=0;
        float sum=0;
        float m=0;
        for(int i=0; i<n; i++) {
            a[i]=Integer.parseInt(s.nextToken());
            for(int j=0; j<n; j++){
                if(a[j]>m) {
                    m = a[j];
                }}}
        for(int i=0; i<n; i++){
            a[i]=a[i]/m*100;
            sum+=a[i];
        }
        res=sum/n;
        System.out.println(res);


    }
}
