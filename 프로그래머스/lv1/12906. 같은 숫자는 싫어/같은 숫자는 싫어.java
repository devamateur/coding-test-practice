import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();      // 스택 이용
        
        for(int i=0; i<arr.length; i++){
            // 스택이 비었거나 스택의 top이 arr[i]와 다른 경우
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
        }
        
        int[] answer = new int[st.size()];
        
        for(int i=st.size()-1; i>=0; i--){
            answer[i] = st.pop();
        }
        
        return answer;
    }
}