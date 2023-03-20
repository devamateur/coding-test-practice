class Solution {
    public int[] solution(String s) {
        
        int zeroCount=0;
        int transCount=0;
        while(!s.equals("1")){
            for(int i=0; i<s.length(); i++){        // 제거할 0의 개수
                if(s.charAt(i) == '0'){
                    zeroCount++;
                }
            }
            s = s.replace("0", "");     // 0 제거
            
            s = Integer.toBinaryString(s.length());     // 제거 후 길이를 이진수로 변환
            transCount++;
        }
        
        int[] answer = {transCount, zeroCount};
        return answer;
    }
}