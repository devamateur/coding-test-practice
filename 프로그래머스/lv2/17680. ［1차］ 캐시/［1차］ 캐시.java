import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> q = new LinkedList<>();
        
        // 초반의 캐시는 비어있으므로
        // 무조건 큐에 넣고 cacheSize만큼 5를 더해줬더니 16, 19, 20 테케 통과가 안됐다
        // 초반의 입력에서 cache hit가 발생하는 테케가 있는 것 같다
        
        if(cacheSize == 0){
            answer += cities.length*5;
        }
        else{
            for(int i=0; i<cities.length; i++){
                String city = cities[i].toLowerCase();
                if(q.contains(city)){     // cache hit
                    q.remove(city);
                    q.add(city);
                    answer++;
                }
                else{       // cache miss
                    if(q.size() < cacheSize){
                        q.add(city);
                    }
                    else{       // 사이즈 초과
                        q.poll();       // 가장 오래된 city 삭제
                        q.add(city);
                    }
                    answer += 5;        
                }
            }
        }
        return answer;
    }
}