import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        // 미사일 종료 위치 기준 오름차순 정렬
        Arrays.sort(targets, (a, b) -> a[1]-b[1]);

        // 종료 위치 초기화
        int end = 0;
        
        for(int i=0; i<targets.length; i++){
            
            // 요격 범위를 벗어나면 (다음 미사일 start >= 현재 미사일 end인 경우)
            if(targets[i][0] >= end){
                end = targets[i][1];
                answer++;          // 새로운 요격 미사일 추가
            }
        }
        
        return answer;
    }
}