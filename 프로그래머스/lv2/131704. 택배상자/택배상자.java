import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int[] belt = new int[order.length];   // 컨테이너 벨트: 영재에게 전달되는 상자
        
        for(int i=0; i<order.length; i++){
            belt[i] = order[i];
        }
        Arrays.sort(belt);
        
        // 컨테이너 벨트의 맨 앞에 높인 상자가 현재 순서가 아니면
        // 다른 곳에 보관 => 보조 컨테이너 벨트(스택)
        Stack<Integer> st = new Stack<>();
        
        int idx=0;
        for(int i=0; i<belt.length; i++){
            if(belt[i] != order[idx]){    // 순서가 맞지 않은 경우, 스택에 저장
                st.push(belt[i]);
            }
            if(belt[i] == order[idx]){    // 순서가 맞는 경우
                answer++;
                idx++;
            }
            
            // 보조 컨테이너 벨트에 있는 경우
            while(!st.isEmpty() && st.peek() == order[idx]){
                st.pop();
                answer++;
                idx++;
            }
        }
        
        return answer;
    }
}