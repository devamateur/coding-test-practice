import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        // numbers를 2진수로 변환
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2 == 0){      // 짝수일 때, 2진수가 0으로 끝나므로 단순히 1을 더해주면 됨
                answer[i] = numbers[i]+1;
                continue;
            }
            // 홀수일 때
            String oddToB = Long.toBinaryString(numbers[i]);
            long[] bList = new long[oddToB.length()+1];     // '111'같이 0이 없는 경우 앞에 0을 붙여줌
            
            for(int j=1; j<=oddToB.length(); j++){
                bList[j] = oddToB.charAt(j-1)-'0';
            }

            // 뒤에서부터 '10'을 찾아 '01'로 바꿈
            for(int j=bList.length-1; j>=1; j--){
                if(bList[j] == 1 && bList[j-1] == 0){
                    long t = bList[j];
                    bList[j] = bList[j-1];
                    bList[j-1] = t;
                    break;
                }
            }

            // 10진수로 변환
            long result = 0;
            long toDecimal = 1;
            for(int j=bList.length-1; j>=0; j--){
                result += bList[j]*toDecimal;
                toDecimal *= 2;
            }
            answer[i] = result;
        }        
        
        return answer;
    }
}