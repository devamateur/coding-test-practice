import java.util.*;
class Solution {
    static int[][] tri;
    public int solution(int[][] triangle) {
        int answer = 0;
        
        tri = triangle.clone();       // 깊은 복사
        dp();
        
        for(int i=0; i<tri.length; i++){
            Arrays.sort(tri[i]);
        }
        return tri[tri.length-1][tri.length-1];
    }
    static void dp(){
        for(int i=1; i<tri.length; i++){
            for(int j=0; j<tri[i].length; j++){
                if(j == 0){            // 왼쪽 끝 숫자, 오른쪽 대각선 숫자밖에 못 더함
                    tri[i][j] += tri[i-1][j];
                }
                else if(j == tri[i].length-1){      // 오른쪽 끝 숫자의 경우, 왼쪽 대각선 숫자밖에 못 더함
                    tri[i][j] += tri[i-1][j-1];
                }
                else{          // 가운데 숫자들의 경우, 양쪽 대각선 숫자 중 큰 값을 더함
                    tri[i][j] += Math.max(tri[i-1][j], tri[i-1][j-1]);
                }
            }
        }
    }
}