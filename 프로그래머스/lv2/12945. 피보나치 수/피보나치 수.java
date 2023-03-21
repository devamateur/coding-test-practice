class Solution {
    static int[] cache;
    public int solution(int n) {        
        int answer = 0;
        cache = new int[n+1];
        
        answer = dp(n);
        
        return answer;
    }
    // 재귀로 풀면 시간초과 나서 dp로 해결
    static int dp(int n){
        cache[0] = 0;
        cache[1] = 1;
        
        if(cache[n] != 0){
            return cache[n];
        }
        
        for(int i=2; i<=n; i++){
            cache[i] = (cache[i-1]+cache[i-2])%1234567;
        }
        return cache[n];
    }
}