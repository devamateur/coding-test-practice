import java.util.*;
class Solution {
    public List<String> solution(String[] record) {
        List<String> answer = new ArrayList<>();
    
        // 맵에 [userid, 닉네임] 저장
        Map<String, String> nickname = new HashMap<>();

        for(int i=0; i<record.length; i++){
            String[] word = record[i].split(" ");
            
            if(word.length > 2){
                nickname.put(word[1], word[2]);
            }
        }
        
        for(int i=0; i<record.length; i++){
            String[] word = record[i].split(" ");
            if(word[0].equals("Enter")){
                answer.add(nickname.get(word[1])+"님이 들어왔습니다.");
            }
            else if(word[0].equals("Leave")){
                answer.add(nickname.get(word[1])+"님이 나갔습니다.");
            }
        }
        
        return answer;
    }
}