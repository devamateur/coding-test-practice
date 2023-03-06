class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<=i; j++){        // i만큼 x를 더함
                answer[i] += x;
            }
        }
        
        return answer;
    }
}