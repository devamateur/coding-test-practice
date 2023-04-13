import java.util.*;
class Solution {
    static int[] dx = {-1, 1, 0, 0};        // 상하
    static int[] dy = {0, 0, -1, 1};        // 좌우
    static boolean[][] visited;               // 방문여부 
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        
        visited[0][0] = true;
        bfs(0, 0, maps.length-1, maps[0].length-1, maps);
        
        /*for(int i=0; i<maps.length; i++){
            Arrays.sort(maps[i]);
        }*/
        
        if(maps[maps.length-1][maps[0].length-1] < 2){
            return -1;
        }
        
        return maps[maps.length-1][maps[0].length-1];
    }
    static void bfs(int x, int y, int n, int m, int[][] maps){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        
        while(!q.isEmpty()){
            int[] current = q.poll();           // 현재 좌표를 큐에서 가져옴
            
            for(int i=0; i<4; i++){
                // 이동할 좌표
                int newX = current[0]+dx[i];        
                int newY = current[1]+dy[i];
                
                // 맵 범위를 벗어나는 경우 제외
                if(newX < 0 || newX > n || newY < 0 || newY > m){
                    continue;
                }
                if(!visited[newX][newY] && maps[newX][newY] == 1){
                    visited[newX][newY] = true;
                    maps[newX][newY] = maps[current[0]][current[1]]+1;
                    q.offer(new int[] {newX, newY});        // 큐에 새 좌표 저장
                }
            }
        }
    }
}