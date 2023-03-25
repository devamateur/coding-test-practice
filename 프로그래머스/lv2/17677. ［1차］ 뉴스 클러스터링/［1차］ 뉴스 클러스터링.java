import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
    
        Map<String, Integer> hm = new HashMap<>();      // str1의 다중집합
        Map<String, Integer> hm2 = new HashMap<>();     // str2의 다중집합
        Set<String> set = new HashSet<>();      // 두 문자열의 합집합
        for(int i=0; i<str1.length()-1; i++){
            if(Character.isAlphabetic(str1.charAt(i))
              && Character.isAlphabetic(str1.charAt(i+1))){
                String s = String.valueOf(str1.charAt(i)).toLowerCase()
                    +String.valueOf(str1.charAt(i+1)).toLowerCase();
                hm.put(s, hm.getOrDefault(s, 0)+1);
                set.add(s);
            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            if(Character.isAlphabetic(str2.charAt(i))
              && Character.isAlphabetic(str2.charAt(i+1))){
                String s = String.valueOf(str2.charAt(i)).toLowerCase()
                    +String.valueOf(str2.charAt(i+1)).toLowerCase();
                hm2.put(s, hm2.getOrDefault(s, 0)+1);
                set.add(s);
            }
        }

        double total = 0;
        double common = 0;
        
        // 합집합
        for(String s: set){
            total += Math.max(hm.getOrDefault(s, 0), hm2.getOrDefault(s, 0));
        }
        
        // 교집합
        for(String key: hm.keySet()){
            if(hm2.containsKey(key)){
                common += Math.min(hm.get(key), hm2.get(key));
            }
        }

        if(total == 0){
            return 65536;
        }
        answer = (int)Math.floor((common/total)*65536);
        return answer;
    }
}