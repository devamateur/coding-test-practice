class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int[] sum = new int[sequence.length+1];
        int left=0, right=0;        // 투포인터
        int numLength = Integer.MAX_VALUE;      // 부분 수열 길이
        
        sum[0] = 0;
        for(int i=1; i<sum.length; i++){
            sum[i] = sum[i-1]+sequence[i-1];
        }
        
        while(left <= right){
            if(right > sum.length-1){
                break;
            }
            // for문으로 sum 계산하면 시간초과
            int current = sum[right]-sum[left];
            if(current == k){       // 부분 수열 합이 k일 때
                // 길이가 더 짧은 수열로 갱신
                if(numLength > right-left){
                    answer[0] = left;
                    answer[1] = right-1;
                    numLength = right-left;
                }

                right++;
            }
            else if(current < k){
                right++;
            }
            else{
                left++;
            }

        }
        return answer;
    }
}