import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        int sum=0;
        for(int i=0; i<elements.length; i++){       
            for(int j=0; j<elements.length; j++){
                sum=0;
                for(int k=0; k<=i; k++){        // 길이가 i+1인 부분수열
                    if(j+k >= elements.length){
                        sum += elements[j+k-elements.length];
                    }
                    else{
                        sum += elements[j+k];
                    }
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}