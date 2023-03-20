class Solution {
    public String solution(String s) {
        
        s = s.toLowerCase();        // 모두 소문자로
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].length() == 0){       // 공백인 경우
                sb.append(" ");
                continue;
            }
            else{
                // 단어의 첫 문자가 알파벳인 경우
                if(str[i].charAt(0) >= 'a' && str[i].charAt(0) <= 'z'){
                    sb.append(Character.toUpperCase(str[i].charAt(0)));
                }
                else {       // 숫자인 경우
                    sb.append(str[i].charAt(0));
                }
                sb.append(str[i].substring(1));
                
                if(i != str.length-1){
                    sb.append(" ");                    
                }
            }
        }
        int count=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                count++;
            }
            else{
                break;
            }
        }
        
        if(count == 0){
            return sb.toString().stripTrailing();       // 오른쪽 공백 제거
        }
        
        while(count > 0){
            sb.append(" ");
            count--;
        }
        
        return sb.toString();
    }
}