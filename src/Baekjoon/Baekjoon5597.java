import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> submitted_Student = new ArrayList<Integer>();
        List<Integer> all_Student = new ArrayList<Integer>();

        for(int i=1; i<=30; i++){
            all_Student.add(i);
        }
        for(int i=0; i<28; i++){
            submitted_Student.add(Integer.parseInt(br.readLine()));
        }
        all_Student.removeAll(submitted_Student);
        for(Integer student : all_Student){
            bw.write(String.valueOf(student));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}