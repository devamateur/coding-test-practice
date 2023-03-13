import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<ingredient.length; i++){
            st.push(ingredient[i]);
            
            if(st.size() >= 4){
                String temp = "";
                for(int j=st.size()-1; j>=st.size()-4; j--){        // 스택의 top부터 4개 원소를 가져옴
                    temp += st.elementAt(j);
                }
                if(temp.equals("1321")){     // 1231을 top부터 가져오면 1321
                    answer++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }

            }
        }
        
        return answer;
    }
}