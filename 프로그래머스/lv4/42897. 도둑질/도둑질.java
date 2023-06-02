import java.util.*;

class Solution {
    public long solution(int[] money) {
        int[] map1 = money.clone();
        int[] map2 = money.clone();
        
        map1[0] = money[0];
        map1[1] = Math.max(money[0], money[1]);
        
        map2[0] = 0;
        map2[1] = money[1];
        
        // 집이 원형으로 있기 때문에
        // 처음을 포함하는 경우, 마지막을 포함하는 경우를 나눠서 구한 뒤 둘 중 최대를 택하면 됨
        
        // 처음 집 포함, 마지막 집 제외
        for(int i=2; i<money.length-1; i++){
            map1[i] = Math.max(map1[i-1], map1[i-2]+money[i]);
        }
        
        // 처음 집 제외, 마지막 집 포함
        for(int i=2; i<money.length; i++){
            map2[i] = Math.max(map2[i-1], map2[i-2]+money[i]);
        }
        Arrays.sort(map1);
        Arrays.sort(map2);

        return Math.max(map1[map1.length-1], map2[map2.length-1]);
    }
}