import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        Arrays.sort(strings);
        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(answer);        // n번째 문자가 같을 경우 사전순으로 정렬해야 하므로
        
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).substring(n, n+1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        
        
        return answer;
    }
}