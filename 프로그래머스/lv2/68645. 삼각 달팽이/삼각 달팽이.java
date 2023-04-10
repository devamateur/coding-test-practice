import java.util.*;
class Solution {
    public int[] solution(int n) {

        int size = n*(n+1)/2;
        int[] answer = new int[size];
        
        int[][] snail = new int[n][n];
        
        int x=-1, y=0;
        int num=1;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i%3 == 0){       // 아래로 이동(행 증가)
                    x++;        
                }
                else if(i%3 == 1){      // 오른쪽으로 이동(열 증가)
                    y++;
                }
                else if(i%3 == 2){      // 대각선으로 이동(행, 열 감소)
                    x--;    
                    y--;
                }
                snail[x][y] = num++;
            }
        }
        
        int idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                answer[idx++] = snail[i][j];
            }
        }
        
        return answer;
    }
}