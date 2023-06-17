class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];   // 집합 원소의 개수 n
        
        // 합이 S가 되면서 곱이 최대가 되는 집합을 리턴
        // 곱이 최대가 되려면 s가 n만큼 answer에 골고루 나눠져야 함
        if(n>s){
            return new int[] {-1};
        }
        
        int idx=0;
        
        while(n>0){
            int val = s/n;            
            answer[idx++] = val;
            s -= val;
            n--;
        }
        
        return answer;
    }
}