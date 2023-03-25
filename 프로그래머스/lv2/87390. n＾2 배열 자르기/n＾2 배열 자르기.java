import java.util.*;

class Solution {
    // i행 i열까지의 값이 i인 2차원 배열을 1차원으로 자르는 문제
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        
        // i행 i열까지의 최대값은 i
        // ex) 1행 1열->1, 2행 2열->2
        // 주어진 left, right을 2차원 배열의 인덱스로 만들어서 max를 구함
        long l = left;
        for(int i=0; i<answer.length; i++){
            int x = (int)(l/n+1);      // i행
            int y = (int)(l%n+1);      // i열
            l++;
            answer[i] = Math.max(x, y);
        }
        
        return answer;
    }
}