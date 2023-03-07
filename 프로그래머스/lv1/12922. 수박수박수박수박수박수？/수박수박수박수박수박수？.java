class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++){
            if(i%2 == 0){       // 짝수일 때
                answer += "수";
            }
            else{
                answer += "박";
            }
        }
        return answer;
    }
}