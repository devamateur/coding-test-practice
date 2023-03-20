import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        
        // Arrays.stream(B).boxed().toArray(Integer[]::new)     
        Integer[] newB = new Integer[B.length];
        
        for(int i=0; i<B.length; i++){
            newB[i] = B[i];
        }
        Arrays.sort(newB, Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++){
            answer += A[i]*newB[i];
        }
        
        return answer;
    }
}