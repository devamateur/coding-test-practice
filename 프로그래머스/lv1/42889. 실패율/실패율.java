import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        float[][] falseRate = new float[N][2];      // 실패율 = (아직 도전중인 사용자/해당 스테이지 도전자)
        int count=0;        // 분자
        int count2=0;       // 분모
        for(int i=1; i<=N; i++){
            count=0;
            count2=0;
            falseRate[i-1][0] = i;      // 스테이지 저장
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i){
                    count++;
                }
                if(stages[j] >= i){
                    count2++;
                }
                if(count != 0){
                    falseRate[i-1][1] = (float)count/count2;
                }
            }
        }
        
        Arrays.sort(falseRate, new Comparator<float[]>(){
            @Override
            public int compare(float[] f1, float[] f2){
                return Float.compare(f2[1], f1[1]);     // 1번 컬럼을 기준으로 내림차순
            }
        });
        
        for(int i=0; i<answer.length; i++){
            answer[i] = (int)falseRate[i][0];
        }
        
        return answer;
    }
}