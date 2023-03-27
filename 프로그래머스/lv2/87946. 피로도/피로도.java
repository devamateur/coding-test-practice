class Solution {
    static boolean[] visited;
    static int answer = 0;
    static int result=0;
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];

        dfs(k, 0, dungeons, 0);
        
        return answer;
    }
    
    static void dfs(int k, int idx, int[][] dungeons, int count){
        answer = Math.max(answer, count);
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){      // 최소 필요 피로도
                visited[i] = true;
                dfs(k-dungeons[i][1], i+1, dungeons, count+1);
                visited[i] = false;
            }
        }     
    }
}