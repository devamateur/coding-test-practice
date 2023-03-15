class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int lux=Integer.MAX_VALUE, luy=Integer.MAX_VALUE;   // 왼쪽 위
        int rdx=0, rdy=0;   // 오른쪽 아래
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux=Math.min(i, lux);       // 왼쪽 위 x좌표는 파일이 있는 가장 작은 행 인덱스
                    luy=Math.min(j, luy);       // 왼쪽 위 y좌표는 파일이 있는 가장 작은 열 인덱스
                }
            }
        }
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    rdx=Math.max(rdx, i+1);     // 오른쪽 아래 x좌표는 파일이 있는 가장 큰 행 인덱스+1 
                    rdy=Math.max(rdy, j+1);     // 오른쪽 아래 y좌표는 파일이 있는 가장 큰 열 인덱스+1
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        return answer;
    }
}