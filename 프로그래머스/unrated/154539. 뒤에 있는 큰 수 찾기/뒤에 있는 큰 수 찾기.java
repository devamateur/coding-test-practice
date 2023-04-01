import java.util.*;
class Solution {
    // 뒤에 있는 큰 수를 찾는 문제
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> st = new Stack<>();
        
        // 입력의 크기가 100만이므로 그냥 이중 for문으로 해결할 수 없음  

        for(int i=0; i<numbers.length; i++){
            // 스택이 비어있지 않고
            // 현재 스택 인덱스가 가리키는 값보다 numbers[i]가 큰 동안
            // 해당 인덱스의 뒷 큰수는 numbers[i]
            while(!st.isEmpty() && numbers[st.peek()] < numbers[i]){
                answer[st.pop()] = numbers[i];
            }
            st.push(i);     // 스택에 값이 아닌 인덱스를 저장
        }
        
        while(!st.isEmpty()){
            answer[st.pop()] = -1;
        }
        
        return answer;
    }

}