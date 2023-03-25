import java.util.*;
class Solution {
    // 서로 다른 옷의 조합의 수를 리턴하는 문제
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hm = new HashMap<>();
        
        // 해시맵에 [의상 종류, 종류 개수] 저장
        for(int i=0; i<clothes.length; i++){
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
        }
        
        for(String key: hm.keySet()){   
            
            // 각 종류에서 1개를 선택 + 0개를 선택하는 가짓수 = 종류별로 1개를 입거나 안 입는 조합
            answer *= combi(hm.get(key), 1) + combi(hm.get(key), 0);
        }
        
        return answer-1;
    }
    static int combi(int n, int r){
        if(n == r || r == 0){
            return 1;
        }
        else{
            return combi(n-1, r-1) + combi(n-1, r);
        }
    }
}