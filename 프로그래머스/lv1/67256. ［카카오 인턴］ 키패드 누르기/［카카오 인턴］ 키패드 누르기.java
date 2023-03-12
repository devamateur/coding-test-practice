class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[] pos={10, 12};
        
        for(int i=0; i<numbers.length; i++){
            int number = numbers[i];
            if(numbers[i] == 0){        // 0은 11로 치환
                number = 11;        
            }
            if(number % 3 == 1){
                answer += "L";
                pos[0] = number;
                
            }
            else if(number % 3 == 0){
                answer += "R";
                pos[1] = number;
            }
            else{
                // 맨허튼 거리
                // 경로 절대값 구하기
                int leftDistance = Math.abs(number-pos[0]);   
                int rightDistance = Math.abs(number-pos[1]);

                // 절대값/3: 세로거리, 절대값%3: 가로거리
                leftDistance = (leftDistance/3) + (leftDistance%3);
                rightDistance = (rightDistance/3) + (rightDistance%3);
                
                if(leftDistance < rightDistance){
                    answer += "L";
                    pos[0] = number;
                }
                else if(leftDistance > rightDistance){
                    answer += "R";
                    pos[1] = number;
                }
                else{       // 거리가 같을 때, 오른손잡이면 오른손 왼손잡이면 왼손
                    answer += hand.substring(0, 1).toUpperCase();
                    if(hand.equals("left")){
                        pos[0] = number;
                    }
                    else{
                        pos[1] = number;
                    }
                }
            }    
        }
        return answer;
    }
}