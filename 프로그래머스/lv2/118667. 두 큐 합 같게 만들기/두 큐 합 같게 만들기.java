import java.util.*;

/* 두 큐의 합 같게 만들기 */
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        // 각 큐 q1, q2 원소의 합을 sum1, sum2에 저장하고
        // sum1과 sum2를 비교해서 합이 큰 큐의 원소를 다른 큐에 추가해준다
        int answer = 0;
            
        long sum1=0, sum2=0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
    

        for(int i=0; i<queue1.length; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        int end = (q1.size()+q2.size()) * 2;    // 최대 순환 길이

        while(sum1 != sum2){
            if(sum1 > sum2){          // q1의 합이 더 큰 경우
                int peek1 = q1.poll();
                q2.add(peek1);      // q1에서 원소를 제거하고 q2에 추가
                sum1 -= peek1;
                sum2 += peek1;
            }

            else{
                int peek2 = q2.poll();
                q1.add(peek2);
                sum2 -= peek2;
                sum1 += peek2;
            }
 
            answer++;
            
            if(answer > end){         // 반복 횟수가 원소 갯수보타 커지면 break
                return -1;
            }
        }
        
        return answer;
    }
}