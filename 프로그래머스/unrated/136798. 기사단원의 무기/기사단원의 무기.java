class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] numOfDivisor = new int[number+1];     // 약수의 개수 저장
        for(int i=1; i<=number; i++){
            for(int j=1; j*j<=i; j++){      // 해당 수가 제곱근까지의 수로 나누어떨어지는지 확인 ex) i=100 -> 100을 1부터 10까지의 수로 나눔
                if(j*j == i){
                    numOfDivisor[i]++;
                }
                else if(i%j == 0){
                    numOfDivisor[i] += 2;
                }
            }
        }

        
        for(int i=1; i<=number; i++){
            if(numOfDivisor[i] <= limit){       // 약수 개수가 limit을 넘지 않을 때
                answer += numOfDivisor[i];
            }
            else{       // 약수 개수가 limit을 넘으면 power를 더함
                answer += power;
            }
        }
        
        return answer;
    }
}