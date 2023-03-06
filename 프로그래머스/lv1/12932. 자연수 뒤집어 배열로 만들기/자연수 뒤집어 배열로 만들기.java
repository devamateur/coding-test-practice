class Solution {
    public int[] solution(long n) {
        String[] str = Long.toString(n).split("");      // long to String
        int len = str.length-1;
        int[] answer = new int[len+1];
        
        for(int i=len; i>=0; i--){
            answer[len-i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}