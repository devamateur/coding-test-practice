import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = new String[s.length()];
        
        for(int i=0; i<s.length(); i++){
            str[i] = String.valueOf(s.charAt(i));
        }
        
        Arrays.sort(str, Collections.reverseOrder());
        
        for(int i=0; i<str.length; i++){
            answer += str[i];
        }
        return answer;
    }
}