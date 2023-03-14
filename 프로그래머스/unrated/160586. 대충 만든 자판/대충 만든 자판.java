import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> hm = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                if(hm.containsKey(c)){      // containsKey(키값): 해당 키-value가 존재하는지 확인
                    hm.put(c, Math.min(hm.get(c), j+1));    // 이미 저장된 인덱스와 현재 인덱스 중 최소를 저장 ex) 테케1 - "ABACD"에서 (A, 1)을 저장한 뒤 세 번째 A에서 1 < 3이므로 3으로 갱신하지 않고 1 그대로 저장
                }
                else{
                    hm.put(c, j+1);
                }
            }
        }
        
        // 인덱스를 모두 더해 횟수를 리턴
        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                answer[i] += hm.getOrDefault(targets[i].charAt(j), 0);
                if(hm.getOrDefault(targets[i].charAt(j), 0) == 0){
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}