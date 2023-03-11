import java.util.Arrays;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int[] result = new int[3];
        int n=0;
        int idx=0;
        String num="";      // 숫자를 저장하는 문자열
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);

            if(Character.isDigit(c)){ 
                num += String.valueOf(c);
            }
            
            if(c=='S'||c=='D'||c=='T'){
                n=Integer.parseInt(num);
                if(c=='S'){
                    result[idx++]=n;
                }
                else if(c=='D'){
                    result[idx++]=(int)Math.pow(n,2);
                }
                else{
                    result[idx++]=(int)Math.pow(n,3);
                }
                num="";     // 문자열 초기화, 다음 수를 저장하기 위해
            }
            
            // 옵션 어려움
            else {
                if(c=='*'){
                    result[idx-1]*=2;
                    if(idx >= 2) {
                        result[idx-2]*=2; 
                    }
                }
                if(c=='#') {
                    result[idx-1]*=(-1);
                }
            }
        }

        for(int i=0; i<3; i++){
            answer += result[i];
        }
        return answer;
    }
}