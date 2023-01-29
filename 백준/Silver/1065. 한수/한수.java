import java.io.*;
class Main{
    static int findHansu(int n){
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(n<100)
                count++;
            else{
                count = 99;
                if(n == 1000){	// 예외처리
			        n = 999;
		        }
                
                for (int j = 100; j <= n; j++) {
    				int hun = j / 100; // 백의 자릿수
    				int ten = (j / 10) % 10; // 십의 자릿수
    				int one = j % 10;
     
    				if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
    					count++;
    				}
    			}
            }
        }
        return count;
    }
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        
        System.out.print(findHansu(limit));
    }
}