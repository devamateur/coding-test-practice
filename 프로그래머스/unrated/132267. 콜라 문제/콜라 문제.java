class Solution {
    public int solution(int a, int b, int n) {      // a: 줘야 하는 빈 병, b: a를 주면 받는 콜라 병 수, n: 가지고 있는 빈 병의 수
        int answer = 0;
        
        while(n >= a){
            answer += (n/a)*b;    
            n = (n/a)*b+(n%a);      // n이 a로 나눠떨어지지 않을 때 n%a가 더해짐
        }
        
        return answer;
    }
}