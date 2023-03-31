import java.util.*;

class Solution {
    int solution(int[][] land) {
        int[][] result = new int[land.length][4];
        result = dp(land);
        // 오름차순 정렬
        for(int i=0; i<result.length; i++){
            Arrays.sort(result[i]);
        }
        
        return result[result.length-1][3];
    }
    
    static int[][] dp(int[][] land){
        for(int i=1; i<land.length; i++){
            // 누적합 저장, 같은 열을 밟을 수 없으므로 같은 열은 더하지 않음
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }
        return land;
    }
}