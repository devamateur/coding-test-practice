import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);     // 오름차순 정렬
        
        for(int i=score.length-m; i>=0; i -= m){
            answer += score[i]*m;       // 뒤에서부터 각 상자당 앞에 있는 사과의 점수(각 상자 당 최저 사과 점수)를 곱함
        }
        
        return answer;
    }
}