class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // -1로 초기화
        for(int i=0; i<answer.length; i++){
            answer[i] = -1;
        }
        
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i)){
                    answer[j] = j-i;
                }
            }
        }
        
        return answer;
    }
}