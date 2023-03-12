import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]!= 0){
                    st.push(board[j][moves[i]-1]);      // 바구니에 인형을 넣음
                    board[j][moves[i]-1] = 0;       // 넣은 인형은 0으로 표시
                    
                    if(st.size() > 1){
                        int top = st.peek();
                        
                        // 바구니 맨 위 인형 2개를 비교
                        if(top == st.elementAt(st.size()-2)){
                            answer += 2;
                            st.pop();
                            st.pop();
                        }
                    }
                    break;
                }
            }
            
        }

        return answer;
    }
}