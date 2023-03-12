import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hm = new HashMap<>();      // 참가자 (이름, 참가 및 완주 여부) 저장
        String answer = "";
  
        // 참가자
        for(int i=0; i<participant.length; i++){
            hm.put(participant[i], hm.getOrDefault(participant[i], 0)+1);   // getOrDefault(키값, 해당 키값이 없을 때 default값)
        }
        
        // 완주자(value를 -1)
        for(int i=0; i<completion.length; i++){
            hm.put(completion[i], hm.get(completion[i])-1);
        }
        
        for(String key: hm.keySet()){
            if(hm.get(key) > 0){        // 참가는 했지만 완주는 못함
                answer = key;
            }
        }
        
        return answer;
    }
}