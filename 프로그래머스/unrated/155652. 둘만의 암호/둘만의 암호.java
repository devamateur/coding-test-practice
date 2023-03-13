class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char[] c = s.toCharArray();
        int count=0;
        for(int i=0; i<c.length; i++){
            for(int j=0; j<index; j++){
                c[i]++;     // index만큼 알파벳을 뒤로 민다
            
                if(c[i] > 122){     // z보다 커질 경우 다시 a부터
                    c[i] = (char)(c[i]%122+96);
                }

                /* skip에 포함되는 동안 계속 뒤로 미룸 */
                // 처음에 if문으로 skip에 포함되면 count를 +1하는 방식으로 했는데
                // 단순히 count를 늘리는 게 아니라 포함되는 동안 계속 뒤로 미루는 거였다
                while(skip.contains(c[i]+"")){
                    c[i]++;

                    if(c[i] > 122){
                        c[i] = (char)(c[i]%122+96);
                    }
                } 
            }
        }
        
        for(int i=0; i<c.length; i++){
            answer += c[i];
        }
        
        return answer;
    }
}