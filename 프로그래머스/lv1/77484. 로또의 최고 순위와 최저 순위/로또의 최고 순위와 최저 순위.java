class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int minCount=0;     // 최고 당첨 count
        int maxCount=0;     // 최저 당첨 count
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    minCount++;
                    maxCount++;
                }
            }
            if(lottos[i] == 0){
                maxCount++;
            }
        }
        
        // 최고 당첨 순위
        if(maxCount == 0){
            answer[0] = 6;
        }
        else{
            answer[0] = 6-maxCount+1;       
        }
        
        // 최저 당첨 순위
        if(minCount == 0){
            answer[1] = 6;
        }
        else{
            answer[1] = 6-minCount+1;
        }
        
        return answer;
    }
}