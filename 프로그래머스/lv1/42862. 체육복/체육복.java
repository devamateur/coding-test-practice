import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;        
        boolean[] isChecked = new boolean[n];       // 체육복을 빌려 준 경우 체크
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌을 가져온 학생이 도난당한 경우 -> 1개만 남음
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(reserve[i] == lost[j]){
                    isChecked[reserve[i]-1] = true;
                    answer++;
                    break;
                }
            }
        }

        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(!isChecked[lost[j]-1] && !isChecked[reserve[i]-1]){
                    if(reserve[i] == lost[j]-1 || reserve[i] == lost[j]+1){
                        isChecked[lost[j]-1] = true;
                        isChecked[reserve[i]-1] = true;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}