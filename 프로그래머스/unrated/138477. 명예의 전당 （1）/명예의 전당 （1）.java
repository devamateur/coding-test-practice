import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();     // 명예의 전당에 오른 점수 저장
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());     // 내림차순 정렬
            if(list.size() > k){        // 리스트에 저장된 점수가 k개를 넘으면
                list.remove(list.size()-1);     // 제일 낮은 점수 제거
            }
            answer[i] = list.get(list.size()-1);        // 낮은 점수 발표
        }
        
        return answer;
    }
}