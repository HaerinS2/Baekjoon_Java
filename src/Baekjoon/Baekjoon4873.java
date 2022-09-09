public class Baekjoon4873 {
    public static void main(String[] args) {
        boolean[] selfNums = new boolean[10001];

        for(int i=1; i<10001; i++){
            int a=d(i);

            if(a<10001){
                selfNums[a]=true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<10001; i++){
            if(!selfNums[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int d(int num){
        int sum = num;
        while(num!=0){
            sum+=(num%10);
            num/=10;
        }
        return sum;

    }
}
