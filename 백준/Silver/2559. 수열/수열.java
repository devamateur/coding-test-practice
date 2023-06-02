import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();     // 온도 개수
        int K = sc.nextInt();     // 연속 날짜 수
        int[] days = new int[N];
        
        for(int i=0; i<N; i++){
            days[i] = sc.nextInt();
        }
        
        int max=Integer.MIN_VALUE;
        
        // 부분합
        int[] sums = new int[N+1];
        
        for(int i=1; i<N+1; i++){
            sums[i] = sums[i-1]+days[i-1];
        }
        
        for(int i=0; i<N-K+1; i++){
            if(sums[i+K]-sums[i] > max){
                max = sums[i+K]-sums[i];
            }
        }
        
        System.out.println(max);
    }
}