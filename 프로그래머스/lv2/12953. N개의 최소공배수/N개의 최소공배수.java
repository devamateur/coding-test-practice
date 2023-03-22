import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        
        int lcm = arr[arr.length-1];
        int count=0;
        while(count < arr.length){
            count=0;
            for(int i=0; i<arr.length; i++){
                if(lcm%arr[i] == 0){
                    count++;
                }
                else{
                    lcm++;
                }
            }
        }
        
        return lcm;
    }
}