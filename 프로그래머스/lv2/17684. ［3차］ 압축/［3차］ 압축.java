import java.util.*;

class Solution {
    public List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();
        
        // 길이가 1인 모든 단어로 사전 초기화
        for(int i=0; i<26; i++){
            hm.put((char)(65+i)+"", i+1);
        }
        
        for(int i=0; i<msg.length(); i++){
            String w = msg.charAt(i)+"";
                        
            // w가 마지막 문자면 break
            if(i == msg.length()-1){
                answer.add(hm.get(w));
                break;
            }
            
            String c = msg.charAt(i+1)+"";

            while(hm.containsKey(w+c)){
                w += c;     // w=w+c
                i++;        
                
                if(i == msg.length()-1){
                    c = "";
                    break;
                }
                c = msg.charAt(i+1)+"";   // c는 w+c 다음 문자를 가리킴
            }
            
            // w+c가 사전에 없는 경우, 사전에 등록
            if(hm.getOrDefault(w+c, 0) == 0){
                hm.put(w+c, hm.size()+1);
            }
            
            if(hm.containsKey(w)){
                answer.add(hm.get(w));
            }
        }
        
        return answer;
    }
}