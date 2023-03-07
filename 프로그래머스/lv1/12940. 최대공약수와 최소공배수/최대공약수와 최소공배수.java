class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수
        for(int i=n; i>=1; i--){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;
                break;
            }
        }
        // 최소공배수
        for(int i=n; i<=n*m; i++){
            if(i%n == 0 && i%m == 0){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}