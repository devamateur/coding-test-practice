class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n보다 큰 자연수 중 
        // 2진수로 변환했을 때 1의 갯수가 n과 같은 수 중 최솟값인 수 구하기
        int biggerThanN = n+1;
        
        int count=0, count2=0;
        while(biggerThanN > n){
            String binaryN = Integer.toBinaryString(n);
            String binaryB = Integer.toBinaryString(biggerThanN);
            
            for(int i=0; i<binaryN.length(); i++){
                if(binaryN.charAt(i) == '1'){
                    count++;
                }
            }
            for(int i=0; i<binaryB.length(); i++){
                if(binaryB.charAt(i) == '1'){
                    count2++;
                }
            }
            
            if(count == count2){
                answer = biggerThanN;
                break;
            }
            biggerThanN++;
            count=0;
            count2=0;
        }
        
        return answer;
    }
}