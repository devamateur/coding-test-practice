import java.util.*;

class Solution {
    // 다른 번호의 접두사인 번호가 있는지 확인하는 문제
    public boolean solution(String[] phone_book) {

        // 사전순으로 정렬하면
        // 바로 옆 번호랑만 비교하면 됨
        Arrays.sort(phone_book);     
        
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){        // startsWith() 이용
                return false;
            }
        }
        return true;
    }
}