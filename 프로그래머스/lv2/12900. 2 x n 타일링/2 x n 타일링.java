class Solution {
    static int[] cache;
    public int solution(int n) {
        int answer = 0;
        cache = new int[n+1];
        answer = dp(n);
        
        return answer;
    }
    static int dp(int n){
        cache[1] = 1;
        if(n == 1){
            return cache[1];
        }
        cache[2] = 2;
        if(n == 2){
            return cache[2];
        }
        for(int i=3; i<=n; i++){
            cache[i] = (cache[i-1]+cache[i-2])%1000000007;
        }
        return cache[n];
    }
}