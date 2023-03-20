import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(num);       // 오름차순 정렬
        answer += num[0]+" "+num[num.length-1];     // 최소 최대
        return answer;
    }
}