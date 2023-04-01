class Solution {
    static int[] cache = new int[1000001];
    static int answer = Integer.MAX_VALUE;      // 최소 count값으로 갱신
    static int count = 0;
    
    // x를 y로 바꾸는 데 필요한 최소 연산 횟수 구하기
    // 연산 - x+n, x*2, x*3
    public int solution(int x, int y, int n) {
        
        // dfs로 풀면 시간초과가 난다..
        // 더미값, 이후에 연산을 통해 최솟값으로 갱신
        for(int i=x+1; i<=y; i++){
            cache[i] = Integer.MAX_VALUE;
        }
        cache[x] = 0;
        
        answer = dp(x, y, n);
        
        // 더미값이 갱신되지 않았으면 변환할 수 없는 경우이므로 -1 리턴
        if(answer == Integer.MAX_VALUE){
            answer = -1;
        }
        
        return answer;
    }
    static int dp(int x, int y, int n){
        for(int i=x; i<=y; i++){
            // 갱신되지 않은 값에는 연산을 하지 X
            if(cache[i] == Integer.MAX_VALUE){
                continue;
            }
            // 연산의 횟수 저장
            if(i+n <= y){
                cache[i+n] = Math.min(cache[i+n], cache[i]+1);
            }
            if (i*2 <= y){
                cache[i*2] = Math.min(cache[i*2], cache[i]+1);
            }

            if (i*3 <= y){
                cache[i*3] = Math.min(cache[i*3], cache[i]+1);
            }
        }
        return cache[y];
    }
}