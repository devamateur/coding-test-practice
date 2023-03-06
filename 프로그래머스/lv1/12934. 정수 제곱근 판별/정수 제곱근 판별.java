class Solution {
    public double solution(long n) {
        double answer = 0;
        
        for(int i=1; i<=n; i++){
            if(Math.pow(i, 2) == n){        // n이 i의 제곱이면
                answer = Math.pow(i+1, 2);
                break;
            }
        }
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
}