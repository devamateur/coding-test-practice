import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		int[] counting = new int[8001];
		double average = 1;
		int sum = 0;
		int mode = 10000;
		
		for(int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			counting[numbers[i] + 4000]++;
		}
		
		Arrays.sort(numbers);		// 정렬
		
		for(int i=0; i<n; i++) {
			sum += numbers[i];
		}
		average = Math.round((double)sum/n);
		
		boolean flag = false;		// 동일한 최빈값이 한 번 등장했을 경우 true, 아니면 false
		int modeMax = 0;
		
		for(int i=numbers[0] + 4000; i<=numbers[n-1] + 4000; i++) {
			if(counting[i] > 0) {
				if(modeMax < counting[i]) {
					modeMax = counting[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(modeMax == counting[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		
		bw.write(String.valueOf((int)average) + "\n");	// 산술 평균
		bw.write(String.valueOf(numbers[(n+1)/2 - 1]) + "\n");	// 중앙값
		bw.write(String.valueOf(mode) + "\n");	// 최빈값
		bw.write(String.valueOf(numbers[n-1] - numbers[0]));	// 범위
		
		br.close();
		bw.flush();
		bw.close();
	}
}