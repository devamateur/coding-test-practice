import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        /* 문제에서 가로, 세로라고 명시했지만
        가로로 눕힐 수 있기 때문에 어떤 모서리는 가로도 될 수 있고 세로도 될 수 있음
        그러나 한 모서리를 가로라고 하면 다른 모서리는 반드시 세로
        따라서, 두 모서리 중 큰 값을 가로로 작은 값을 세로로 지정하고
        둘의 곱의 최대를 구하면 됨*/
        List<Integer> width = new ArrayList<>();
        List<Integer> height = new ArrayList<>();
        
        int maxWidth = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        for(int i=0; i<sizes.length; i++){
            maxWidth = Math.max(sizes[i][0], sizes[i][1]);
            width.add(maxWidth);
            minHeight = Math.min(sizes[i][0], sizes[i][1]);
            height.add(minHeight);
        }
        
        int answer=0;
        for(int i=0; i<width.size(); i++){
            for(int j=0; j<height.size(); j++){
                if(width.get(i)*height.get(j) > answer){
                    answer = width.get(i)*height.get(j);
                }
            }
        }
        return answer;
    }
}