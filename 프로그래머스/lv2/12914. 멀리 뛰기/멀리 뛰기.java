class Solution {
    static long[] cache;
    public long solution(int n) {
        // 피보나치
        cache = new long[n+1];
        long answer = dp(n);
    
        return answer;
    }
    
    static long dp(int n){
        cache[1] = 1;
        
        if(cache[n] != 0){
            return cache[n];
        }
        if(n == 2){
            cache[2] = 2;
        }
        if(n == 3){
            cache[3] = 3;
        }

        if(n >= 4){
            cache[2] = 2;
            cache[3] = 3;
            for(int i=4; i<=n ;i++){
                cache[i] = (cache[i-1] + cache[i-2])%1234567;
            }
        }

        return cache[n];
    }
}