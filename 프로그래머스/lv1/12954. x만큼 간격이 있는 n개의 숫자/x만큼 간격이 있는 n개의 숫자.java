class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        answer[0] = x;
        for(int i=1; i<answer.length; i++){
            answer[i] = answer[i-1]+x;      // 이전 수에 x만큼 더함
        }
        
        return answer;
    }
}