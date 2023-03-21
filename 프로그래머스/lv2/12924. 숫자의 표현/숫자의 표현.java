class Solution {
    // 자연수 n을 연속한 자연수들로 표현하는 문제
    public int solution(int n) {
        int answer = 0;
        
        // 연속한 자연수들로 표현하는 문제 = 홀수인 약수의 개수
        // ex) 15의 약수 = 1, 3, 5, 15
        // 약수 1: 15
        // 약수 3: 3+3+3+3+3 => 1+2+3+4+5
        // 약수 5: 5+5+5 => 4+5+6
        // 약수 15(2n+1): n+(n+1) => 7+8
        for(int i=1; i<=n; i++){        
            if(n%i == 0 && i%2 == 1){
                answer++;
            }
        }
        
        return answer;
    }
}