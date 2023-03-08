class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                if(Character.isUpperCase(s.charAt(i))){
                    if(s.charAt(i)+n <= 'Z'){       // 알파벳을 n만큼 민 값이 Z보다 작거나 같은 경우
                        answer += (char)(s.charAt(i)+n);    
                    }
                    else{       // 알파벳을 n만큼 민 값이 Z보다 큰 경우
                        answer += (char)((s.charAt(i)+n)%90+64);    // 아스키코드 A=65, Z=90
                    }
                }
                else{
                    if(s.charAt(i)+n <= 'z'){
                        answer += (char)(s.charAt(i)+n);
                    }
                    else{
                        answer += (char)((s.charAt(i)+n)%122+96);  // a=97, z=122
                    }
                }
            }
            else{
                answer += " ";
            }
        }
        
        return answer;
    }
}