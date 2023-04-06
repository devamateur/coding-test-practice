import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        int[] pos = {0, 0};
        
        // 셋에 좌표 저장
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<dirs.length(); i++){

            List<Integer> list = new ArrayList<>();
            list.add(pos[1]);
            list.add(pos[0]);
            if(pos[0] < 5 && dirs.charAt(i) == 'U'){
                pos[0]++;
            }
            if(pos[0] > -5 && dirs.charAt(i) == 'D'){
                pos[0]--;
            }
            if(pos[1] < 5 && dirs.charAt(i) == 'R'){
                pos[1]++;
            }
            if(pos[1] > -5 && dirs.charAt(i) == 'L'){
                pos[1]--;
            }
            list.add(pos[1]);
            list.add(pos[0]);

            String temp = list.get(0)+list.get(1)+"";
            String temp2 = list.get(2)+list.get(3)+"";
            
            // 시작 종료 좌표 순서만 바뀐 경우 처음 걸어본 길이 아님
            if(!set.contains(Arrays.asList(list.get(2), list.get(3), list.get(0), list.get(1)))){
                if(!temp.equals(temp2))     // 시작, 도착 좌표가 같지 않을 때만
                    set.add(list);      // 셋에 (시작x, 시작y, 도착x, 도착y)를 저장
            }
        }

        return set.size();
    }
}