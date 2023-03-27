class Solution {
    static int[] num;
    static int answer;
    public int solution(int[] numbers, int target) {
        
        answer=0;
        num = new int[numbers.length];
        
        for(int i=0; i<num.length; i++){
            num[i] = numbers[i];
        }
        
        dfs(0, 0, target);
        
        return answer;
    }
    
    // count: 배열 인덱스, n: 정수들의 합
    static void dfs(int count, int n, int target){
        if(count == num.length){        // 마지막 원소까지 포함
            if(n == target){
                answer++;
                return;
            }
            return;
        }
        
        dfs(count+1, n+num[count], target);     // 더하는 경우
        dfs(count+1, n-num[count], target);     // 빼는 경우
    }
}