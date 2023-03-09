class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n+1];
        
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }
        for(int i=2; i<=n; i++){        // 에라토스테네스의 체(소수의 배수를 제외)
            for(int j=2*i; j<=n; j+=i){
                isPrime[j] = false;     // 어떤 수의 배수는 소수가 아님
            }
        }
        
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                answer++;
            }
        }
        
        return answer;
    }
}