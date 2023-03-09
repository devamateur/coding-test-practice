class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] findPrime = new int[50001];
        
        for(int i=2; i<=50000; i++){
            for(int j=2*i; j<=50000; j+=i){
                findPrime[j] = 1;      // 소수가 아님
            }
        }
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(findPrime[nums[i]+nums[j]+nums[k]] == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}