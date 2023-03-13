import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        
        answer = answer.replaceAll("[^0-9a-z-_.]", "");     // 숫자, 알파벳 소문자, -, _, .이 아닌 문자 제거
        
        answer = answer.replaceAll("\\.{2,}", ".");     // 2번 이상의 마침표는 한 번으로
        answer = answer.replaceAll("^[.]|[.]$", "");     // 마침표가 처음이나 끝에 위치하면 제거
        
        if(answer.length() == 0){       // 빈 문자열일 경우 a 추가
            answer += "a";
        }
        if(answer.length() >= 16){      // 16자 이상일 경우 15자까지
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        
        if(answer.length() <= 2){       // 2장 이하일 경우 마지막 문자를 뒤에 추가
            while(answer.length() < 3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        
        return answer;
    }
}