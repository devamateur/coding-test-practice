class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str="";
        
        // n을 3으로 나눈 나머지 => 3진법
        while(n>0){
            str += n%3;
            n /= 3;
        }
        
        char[] c = str.toCharArray();
        for(int i=c.length-1; i>=0; i--){
            answer += (c[i]-'0')*Math.pow(3, c.length-1-i);  // 3진법은 3의 0승~3의 n-1승
        }
        
        return answer;
    }
}