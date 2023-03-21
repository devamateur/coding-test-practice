class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<brown; i++){
            for(int j=1; j<brown; j++){
                if((i*j == brown+yellow) && (j>=i)
                  &&((j-2)*(i-2) == yellow)){
                    answer[0] = j;
                    answer[1] = i;
                }
            }
        }
        
        return answer;
    }
}