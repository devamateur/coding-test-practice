import java.io.*;
class Main{
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] countAlpha = new int[26];
        char mostUse = ' ';
        
        for(int i=0; i<countAlpha.length; i++){
            countAlpha[i] = 0;
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
                countAlpha[c-'a']++;
            if(Character.isUpperCase(c))
            	countAlpha[c-'A']++;
        }
        
        int max = 0;
        for(int i=0; i<countAlpha.length; i++) {
        	if(countAlpha[i] > max) {
        		max = countAlpha[i];
        		mostUse = (char)(i + 65);		// 대문자 출력을 위해 65를 더함
        	}
        	else if(countAlpha[i] == max)
        		mostUse = '?';
        }
        
        System.out.println(mostUse);
    }
}