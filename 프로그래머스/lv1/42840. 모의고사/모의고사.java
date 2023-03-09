import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] A = {1,2,3,4,5};
        int[] B = {2,1,2,3,2,4,2,5};
        int[] C = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(A[i%A.length] == answers[i]){        // 주어진 정답의 수가 A.length보다 크면 나머지 연산 ex) 정답의 수가 10개일 경우 6번째 정답은 A의 0번째인 1과 비교
                score[0]++;        
            }
            if(B[i%B.length] == answers[i]){
                score[1]++;
            }
            if(C[i%C.length] == answers[i]){
                score[2]++;
            }
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));     // max score
        if(max == score[0]){
            answer.add(1);
        }
        if(max == score[1]){
            answer.add(2);
        }
        if(max == score[2]){
            answer.add(3);
        }
        
        return answer;
    }
}