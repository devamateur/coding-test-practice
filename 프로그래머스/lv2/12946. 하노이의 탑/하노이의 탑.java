import java.util.*;
class Solution {
    static List<int[]> list = new ArrayList<>();
    public int[][] solution(int n) {
        
        hanoi(1, 2, 3, n);
        int[][] answer = new int[list.size()][];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    static void hanoi(int from, int middle, int to, int n){
        if(n == 1){
            list.add(new int[] {from, to});
            return;
        }
        hanoi(from, to, middle, n-1);       // 큰 원판을 제외한 n-1개 원판을 가운데로
        list.add(new int[] {from, to});    // 가장 큰 원판을 오른쪽으로
        hanoi(middle, from, to, n-1);       // 가운데의 n-1개 원판을 오른쪽으로
    }
}