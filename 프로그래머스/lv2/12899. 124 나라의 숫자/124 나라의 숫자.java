class Solution {
    // 124 나라의 숫자
    // 124 나라에서는 모든 수를 1, 2, 4로 나타냄
    // ex) 1->1, 2->2, 3->4, 4->11, 5->12, 6->14, 7->21, 8->22, 9->24...
    // 앞 숫자는 3으로 나눈 몫, 뒤는 3으로 나눈 나머지로 나타낼 수 있음
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] strangeNum = {"1", "2", "4"};
        
        int remain = 0;     // 나머지
        while(n > 0){
            remain = n%3;
            n /= 3;
            
            if(remain == 0){        // 나눠 떨어지는 경우 -1을 해줘야 함 ex) 6 -> 3으로 나눈 몫이 2지만 1로 시작함
                n = n-1;
                remain = 4;
            }
            answer.append(remain);
        }

        return answer.reverse().toString();
    }
}