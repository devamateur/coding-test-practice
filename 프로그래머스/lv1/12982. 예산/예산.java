import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);     // 오름차순 정렬
        
        for(int i=0; i<d.length; i++){
            if(d[i] <= budget){
                budget -= d[i];
                answer++;
            }
        }
        
        return answer;
    }
}