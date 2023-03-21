class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        boolean breaker = false;        // 이중 반복문을 빠져나가기 위한 변수
        
        for(int i=1; i<words.length; i++){
                        
            // 이전 단어의 끝말로 잇지 않은 경우
            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            // 이전에 한 단어를 또 말한 경우
            for(int j=0; j<i; j++){
                if(words[j].equals(words[i])){      
                    answer[0] = i%n+1;
                    answer[1] = i/n+1;
                    breaker = true;
                    break;
                }
            }
            if(breaker){
                break;
            }

        }
        
        return answer;
    }
}