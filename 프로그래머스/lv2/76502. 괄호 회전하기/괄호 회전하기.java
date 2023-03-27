import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
    
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            // 괄호 회전
            String str = s.substring(i) + s.substring(0, i);

            for(int j=0; j<str.length(); j++){
                st.push(str.charAt(j));
                
                if(st.size() >= 2){
                    char top = st.peek();
                    char next = st.elementAt(st.size()-2);
                    if(top == ']' && next == '['){
                        st.pop();
                        st.pop();
                    }
                    if(top == '}' && next == '{'){
                        st.pop();
                        st.pop();
                    }
                    if(top == ')' && next == '('){
                        st.pop();
                        st.pop();
                    }
                }
            }
            // 스택 사이즈가 0이 되면 올바른 괄호 문자열
            if(st.size() == 0){
                answer++;
            }
            st.clear();
        }
        
        return answer;
    }
}