class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");     // s.split(" ")은 공백 단위로 split하므로 공백이 사라짐
        int idx = 0;        // 각 단어의 인덱스
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } 
            else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } 
            else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } 
        return answer;
    }
}