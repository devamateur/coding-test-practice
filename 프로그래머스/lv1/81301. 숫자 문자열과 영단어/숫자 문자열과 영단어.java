class Solution {
    public int solution(String s) {

        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<number.length; i++){
            s = s.replace(number[i], i+"");     // number[i]를 정수 문자열로 replace
        }
        
        return Integer.parseInt(s);
    }
}