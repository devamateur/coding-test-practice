class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i=phone_number.length()-1; i>=0; i--){
            if(i >= phone_number.length()-4){
                answer += phone_number.charAt(i);
            }
            else{
                answer += "*";
            }
        }
        
        StringBuilder sb = new StringBuilder();    
        sb.append(answer);
        return sb.reverse().toString();     // StringBuilder 이용해 reverse
    }
}