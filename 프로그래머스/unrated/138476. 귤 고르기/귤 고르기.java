import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Arrays.sort(tangerine);
        
        // 귤의 무게 종류 갯수를 count
        int[] count = new int[tangerine[tangerine.length-1]+1];
        
        for(int i=0; i<tangerine.length; i++){
            count[tangerine[i]]++;
        }
        
        Arrays.sort(count); 
        
        int n = 0;      // 상자에 담은 귤 개수
        boolean breaker = false;
        
        // 갯수가 가장 많은 무게부터
        for(int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                count[i]--;
                n++;        
                if(n == k){
                    breaker = true;
                    break;
                }
            }
            answer++;       // 무게 종류 count
            
            if(n == k || breaker){
                break;
            }
        }
        
        return answer;
    }
}