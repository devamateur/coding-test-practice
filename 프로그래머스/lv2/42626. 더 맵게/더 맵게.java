import java.util.*;
class Solution {
    // 모든 음식의 스코빌 지수가 K이상이 되도록
    // (스코빌 지수가 가장 낮은 음식 + 두 번째로 낮은 음식*2)로 갱신하는 문제
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int count=0;
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
            if(scoville[i] >= K){       
                count++;
            }
        }

        // 섞지 않은 초기 상태에 이미 모든 음식이 K이상이면
        // 섞을 필요 없으므로 0 리턴
        if(count == scoville.length){
            return 0;
        }
        while(!pq.isEmpty() && pq.size() >= 2){
            if(pq.peek() >= K){     // pq의 가장 작은 값이 K보다 크거나 같으면 break
                break;
            }
            int min = pq.poll();
            int nextMin = pq.poll();
            
            pq.add(min + (nextMin*2));        // 섞은 음식의 스코빌 지수로 갱신
            answer++;
        }

        // 모든 음식의 지수를 K 이상으로 만들 수 없는 경우
        for(int i=0; i<pq.size(); i++){
            if(pq.poll() < K){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}