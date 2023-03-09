import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();      
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);      // set은 중복 원소 포함X
            }
        }
        
        List<Integer> result = new ArrayList<>(answer);
        
        Collections.sort(result);       // 오름차순 정렬
        
        return result;
    }
}