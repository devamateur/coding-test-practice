class Solution {
    public int solution(int num) {
        int answer = 0;
        
        int count=0;
        while(num != 1){
            if(num%2 == 0){
                num /= 2;
                answer++;
            }
            else if(num%2 == 1){
                num = num*3+1;
                answer++;
            }
            count++;
            if(num == 1 || count == 500){
                break;
            }
        }
        if(num != 1 && count == 500){
            answer = -1;
        }
        return answer;
    }
}