class Solution {
    public long solution(int w, int h) {
        // (전체 사각형 - 대각선에 걸친 사각형) 을 구하는 문제
        long answer = (long)w*h;
        
        int a=w;
        int b=h;
        
        // 유클리드 호제법 이용
        while(b != 0){
            if(a < b){
                int temp = a;
                a = b;
                b = temp;
            }
            // b가 0이 아닐 동안 a를 계속 b로 나누면 최대공약수를 구할 수 있음
            // ex) a=8, b=12일 때 
            // a=12, b=8 -> a=8, b=4 -> a=4, b=0 
            int r = a%b;
            a = b;
            b = r;
        }
        long gcd = a;    // w와 h의 최대공약수
        
        return answer-(w+h-gcd);
    }
}