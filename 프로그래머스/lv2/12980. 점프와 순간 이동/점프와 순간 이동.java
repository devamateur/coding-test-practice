import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        while(n > 0){
            // 점프를 수행하면 홀수번 칸에 도착 ex) 1, 3, 5
            if(n%2 == 1){
                ans++;
            }
            n = n/2;
        }
        
        return ans;
    }
}