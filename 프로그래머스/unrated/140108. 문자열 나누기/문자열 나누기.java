class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char c = s.charAt(0);
        int countSame = 1;
        int countDiff = 0;
        //int idx = 0;
        
        for(int j=1; j<s.length(); j++){
            if(c == '\u0000'){      // c가 공백이면 다음 문자로 갱신
                c = s.charAt(j);
                continue;
            }

            if(s.charAt(j) == c){
                countSame++;
            }
            else{
                countDiff++;
            }
            if(countSame == countDiff){
                answer++;
                c = '\u0000';       // 인덱스 값으로 갱신하려 했는데 안 돼서.. char에 공백 문자 넣어놓기
                countSame = 1;
                countDiff = 0;
            }
        }
        if(c != '\u0000'){
            answer++;
        }
        
        return answer;
    }
}