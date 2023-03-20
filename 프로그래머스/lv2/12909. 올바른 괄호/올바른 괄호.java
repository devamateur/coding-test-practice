import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int count=0;

        // 스택 문제인데 스택으로 풀면 시간초과가 나는 문제가 있다?
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){     // 여는 괄호는 +1
                count++;
            }
            else if(s.charAt(i) == ')'){                       // 닫는 괄호는 -1
                count--;
            }
            if(count < 0){      // "())"같은 입력이 들어오면 false
                return false;
            }
        }
        
        if(count == 0){     // 괄호를 더한 합이 0 -> 짝이 맞는 경우
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}