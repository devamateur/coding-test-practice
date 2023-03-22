import java.util.*;

class Solution {
    // 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값 
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);        // 오름차순 정렬
        
        int min = 0, max = people.length-1;

        while(min <= max){
            if(people[min] + people[max] <= limit){     // 둘이 같이 탈 수 있는 경우
                min++;
            }
            answer++;
            max--;      
        }
        
        return answer;
    }
}