class Solution {
    public String solution(int a, int b) {
        
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};     // 월별 총 일수
        
        int total_days=0;
        for(int i=0; i<a-1; i++){       // 입력받은 달의 이전 달까지의 날짜를 더함
            total_days += month[i];
        }
        
        total_days += b-1;      // 입력받은 날짜를 더함
        
        String answer = day[total_days%7];
        return answer;
    }
}