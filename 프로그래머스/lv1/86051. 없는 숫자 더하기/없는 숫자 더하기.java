class Solution {
    public int solution(int[] numbers) {
        boolean[] numCount = new boolean[10];       // 0~9까지 숫자 등장 count
        
        for(int i=0; i<numbers.length; i++){
            numCount[numbers[i]] = true;    
        }
        
        int sum=0;
        for(int i=0; i<numCount.length; i++){
            if(!numCount[i]){
                sum += i;
            }
        }
        return sum;
    }
}