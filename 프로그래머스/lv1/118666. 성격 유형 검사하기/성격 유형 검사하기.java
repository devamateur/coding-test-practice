import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<choices.length; i++){
            if(choices[i]<=3){       // 비동의
                hm.put(survey[i].charAt(0), hm.getOrDefault(survey[i].charAt(0), 0)+4-choices[i]);
            }
            else if(5<=choices[i] && choices[i] <= 7){ // 동의
                hm.put(survey[i].charAt(1), hm.getOrDefault(survey[i].charAt(1), 0)+choices[i]-4);
            }
        }
        
        answer += hm.getOrDefault('R', 0) >= hm.getOrDefault('T', 0) ? "R":"T";
        answer += hm.getOrDefault('C', 0) >= hm.getOrDefault('F', 0) ? "C":"F";
        answer += hm.getOrDefault('J', 0) >= hm.getOrDefault('M', 0) ? "J":"M";
        answer += hm.getOrDefault('A', 0) >= hm.getOrDefault('N', 0) ? "A":"N";

        
        return answer;
    }
}