class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // 숫자 문자열 t, p가 주어질 때
        // t에서 p와 같은 부분문자열 중 p보다 작거나 같은 경우 구하기
        for(int i=0; i<t.length()-p.length()+1; i++){
            String temp = t.substring(i, i+p.length());     // p길이만큼 잘라서 비교
            
            if(Long.parseLong(temp) <= Long.parseLong(p)){      // Integer.parseInt()하면 int범위(약 21억)을 넘어가므로 Long.parseLong()사용
                answer++;
            }
        }
        return answer;
    }
}