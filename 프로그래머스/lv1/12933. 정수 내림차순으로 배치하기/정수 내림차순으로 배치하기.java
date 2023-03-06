import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");

        // 내림차순 정렬
        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o2.compareTo(o1);
            }
        });
        
        String s = "";
        for(int i=0; i<str.length; i++){
            s += str[i];
        }
        long answer = Long.parseLong(s);
        return answer;
    }
}