import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();     // 그냥 String에 더하면 시간초과..
        
        int[] xCount = new int[10];     // X에서 0~9까지 수 count
        int[] yCount = new int[10];     // y애서 0~9까지 수 count
        
        for(int i=0; i<X.length(); i++){
            xCount[(X.charAt(i)-'0')]++;
        }
        for(int i=0; i<Y.length(); i++){
            yCount[(Y.charAt(i)-'0')]++;
        }
                
        for(int i=9; i>=0; i--){        // 가장 큰 수를 구해야 하므로 9부터
            while(xCount[i] > 0 && yCount[i] > 0){      // X, Y 둘 다 i가 있을 때
                sb.append(i);
                
                xCount[i]--;
                yCount[i]--;
            }
        }
        
        if(sb.toString().equals("")){      // 짝꿍이 없는 경우
            return "-1";
        }
        
        if(sb.toString().substring(0, 1).equals("0")){     // 짝꿍이 0인 경우
            return "0";
        }
  
        return sb.toString();
    }
}