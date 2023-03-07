class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int N = s.length();
        if(N != 4 && N != 6){
            answer = false;
        }
        
        for(int i=0; i<N; i++){
            if(!Character.isDigit(s.charAt(i))){
                answer = false;
            }
        }
        
        return answer;
    }
}