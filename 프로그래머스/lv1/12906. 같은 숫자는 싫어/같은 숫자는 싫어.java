import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] == arr[i]){
                continue;
            }
            else{
                answer.add(arr[i]);
            }
        }
        answer.add(arr[arr.length-1]);
        return answer;
    }
}