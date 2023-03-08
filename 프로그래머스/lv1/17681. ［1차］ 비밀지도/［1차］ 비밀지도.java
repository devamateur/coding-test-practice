import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);      // 두 수에 비트 연산자 or 적용 후(하나라도 1이면 1) 이진수 string으로 변환
            
            // 이진수 자릿수 맞춰주기 0을 n-answer[i].length()만큼 앞에 붙여줌
            // ex) 22 -> 10110, 14 -> 1110d이므로 비트연산을 적용하면 11110이 되는데 n은 여섯자리여야 하므로 앞에 0을 붙여서 01110이 됨
            answer[i] = "0".repeat(n-answer[i].length()) + answer[i];
            
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        
        return answer;
    }
}