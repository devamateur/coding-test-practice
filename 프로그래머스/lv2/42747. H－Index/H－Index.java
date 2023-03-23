import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);     // 오름차순 정렬
        
        for(int i=0; i<citations.length; i++){
            // 인용됨 논문 갯수
            // 오름차순으로 정렬했으므로 i번 이후 논문은 무조건 i보다 많이 인용됨
            int h = citations.length-i;     
            
            if(citations[i] >= h){      // 어떤 논문 인용 횟수가 h보다 크다면
                answer = h;
                break;      // h의 최댓값이므로
            }
        }
        
        return answer;
    }
}