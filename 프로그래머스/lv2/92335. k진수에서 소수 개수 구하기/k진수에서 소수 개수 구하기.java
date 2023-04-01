class Solution {
    // k진수에서 소수의 개수 구하기
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        while(n > 0){       // k진수로 바꾸기
            sb.append(n%k+"");
            n /= k;
        }
        
        String[] str = sb.reverse().toString().split("0");
        long[] nums = new long[str.length];
        boolean[] notPrime = new boolean[1000001];
        

        for(int i=0; i<str.length; i++){
            if(str[i].length() != 0){
                nums[i] = Long.parseLong(str[i]);      
            }
        }
        
        // 소수 개수 세기
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                answer++;
            }
        }
        
        return answer;
    }
    static boolean isPrime(long n){
        if(n <= 1){
            return false;
        }
        // 제곱근까지만 고려
        // 어떤 수 n의 약수는 제곱근 범위 안에 반드시 존재하므로
        for(int i=3; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }    
        
        return true;
    }
}