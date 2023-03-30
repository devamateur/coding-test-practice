import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 리스트에 제품을 수량만큼 추가
        List<String> total=new ArrayList<>();
        
        for(int i=0;i<want.length;i++){
            for(int j=0;j<number[i];j++){
                total.add(want[i]);
            }
        }
        
        for(int i=0; i<discount.length-9; i++){
            // Arrays.copyOfRange(배열, 시작, 종료): 배열 복사
            List<String> sub = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(discount, i, i+10)));
            
            for(int j=0; j<total.size(); j++){
                // 원하는 제품이 할인 목록에 있는지 체크
                sub.remove(total.get(j));
            }
                            
            // 모든 제품이 할인 목록에 있으면 answer 증가
            if(sub.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}