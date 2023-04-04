import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> cheolsu = new HashMap<>();      // 철수가 맛볼 수 있는 토핑
        Map<Integer, Integer> brother = new HashMap<>();             // 동생이 맛볼 수 있는 토핑
        
        for(int i=0; i<topping.length; i++){
            cheolsu.put(topping[i], cheolsu.getOrDefault(topping[i], 0)+1);
        }
        
        int take=0;
        while(take < topping.length){
            brother.put(topping[take], brother.getOrDefault(topping[take], 0)+1);
            cheolsu.put(topping[take], cheolsu.get(topping[take])-1);
                
            if(cheolsu.get(topping[take]) == 0){
                cheolsu.remove(topping[take], 0);
            }    

            if(brother.size() == cheolsu.size()){
                answer++;
            }
            take++;
        }
        return answer;
    }
}