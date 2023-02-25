class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int card1=0;        // cards1 인덱스
        int card2=0;        // cards2 인덱스
        
        for(int i=0; i<goal.length; i++){
            // goal과 cards1의 단어가 같을 때
            if(card1 < cards1.length && goal[i].equals(cards1[card1])){
                card1++;        // cards1 인덱스를 증가
            }
            
            // goal과 cards2의 단어가 같을 때
            else if(card2 < cards2.length && goal[i].equals(cards2[card2])){
                card2++;
            }
            else{
                answer="No";
            }
        }
        
        return answer;
    }
}