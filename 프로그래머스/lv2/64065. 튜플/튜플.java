import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        List<Integer> answer = new ArrayList<>();
        String[] str = s.split(",");        // 쉼표를 기준으로 분리
        
        // 중괄호 없애서 숫자만 남김
        for(int i=0; i<str.length; i++){
            str[i] = str[i].replace("{", "");
            str[i] = str[i].replace("}", "");
        }
        
        // 해시맵에 [숫자, 숫자 등장 횟수] 저장
        for(int i=0; i<str.length; i++){
            hm.put(Integer.parseInt(str[i]), hm.getOrDefault(Integer.parseInt(str[i]), 0)+1);
        }
        
        // 해시맵을 숫자 등장 횟수(value)를 기준으로 내림차순 정렬
        List<Integer> keySet = new ArrayList<>(hm.keySet());
        keySet.sort((o1, o2) -> hm.get(o2).compareTo(hm.get(o1)));    // 카운트 기준 내림차순 정렬
                   
        for(int key: keySet){
            answer.add(key);
        }
        
        return answer;
    }
}