class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
                
        // 각 문자열을 숫자 문자열로 바꿈 ex) ayaye -> 01, ayaayaa -> 00a
        for(int i=0; i<babbling.length; i++){      
            babbling[i] = babbling[i].replace("aya", "0");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("woo", "2");
            babbling[i] = babbling[i].replace("ma", "3");
        }
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<babbling[i].length()-1; j++){
                // 숫자가 같다면 같은 발음을 연속해서 하는 것이므로 결과에서 제외
                if(babbling[i].charAt(j) == babbling[i].charAt(j+1)){
                    babbling[i] = "duplicated";
                }
            }
        }
        
        for(int i=0; i<babbling.length; i++){
            // 문자열이 모두 숫자라면 발음할 수 있는 단어
            if(babbling[i].chars().allMatch(Character::isDigit)){
                answer++;
            }
        }
        
        return answer;
    }
}