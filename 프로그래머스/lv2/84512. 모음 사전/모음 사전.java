import java.util.*;
class Solution {
    static String[] alphabet = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();
    static int answer=0;
    static boolean[] visited = new boolean[10001];
    public int solution(String word) {

        dfs("");
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    static void dfs(String cur){
        if(cur.length() > 5){
            return;
        }
        if(!list.contains(cur)){
            list.add(cur);
        }
        for(int i=0; i<alphabet.length; i++){
            dfs(cur+alphabet[i]);
        }
    }
}