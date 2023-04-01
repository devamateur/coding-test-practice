import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        char[] c = number.toCharArray();
                
        char max='0';
        int idx = 0;
        for(int i=0; i<c.length-k; i++){
            max = '0';
            for(int j=idx; j<=k+i; j++){        // j<=k+i: number의 끝까지 고려하기 위함
                if(max < c[j]){
                    max = c[j];
                    idx = j+1;      // 다음 문자의 인덱스 가리킴
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}