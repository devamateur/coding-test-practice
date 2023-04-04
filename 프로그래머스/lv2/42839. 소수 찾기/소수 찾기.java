import java.util.*;
class Solution {
    static boolean[] visited = new boolean[10000000];
    static List<Integer> list = new ArrayList<>();
    public int solution(String numbers) {
        
        dfs("", numbers, 0);
        
        return list.size();
    }
    
    // 소수인지 판별
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    static void dfs(String n, String numbers, int count){
        if(n.length() > 0 && isPrime(Integer.parseInt(n))){
            System.out.println(Integer.parseInt(n));
            
            // 리스트에 새로운 소수 추가
            if(!list.contains(Integer.parseInt(n))){
                list.add(Integer.parseInt(n));
            }
        }
        if(count > numbers.length()-1){
            return;
        }

        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){        // numbers의 인덱스로 방문 여부 표시
                visited[i] = true;

                dfs(n+numbers.charAt(i), numbers, count+1);
                visited[i] = false;      // 백트래킹
            }
        }
    }
}