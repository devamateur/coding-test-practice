import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            st.add(s.charAt(i));
            
            if(st.size() >= 2){
                char top = st.peek();
                char next = st.elementAt(st.size()-2);
                
                if(top == next){
                    st.pop();
                    st.pop();
                }
            }
        }

        if(st.size() == 0){
            answer = 1;
        }
        
        return answer;
    }
}