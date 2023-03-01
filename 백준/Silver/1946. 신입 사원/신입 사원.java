import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

/* 1946. 신입사원 */
// 각 지원자의 점수가 주어질 때, 다른 지원자보다 점수가 떨어지지 않는 경우만 선발하는 경우
// 선발할 수 있는 최대 인원 수
public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());		// 지원자의 수
			
			int[][] score = new int[N][2];
			
			for(int j=0; j<N; j++) {
				String str = br.readLine();
				score[j][0] = Integer.parseInt(str.split(" ")[0]);
				score[j][1] = Integer.parseInt(str.split(" ")[1]);
			}
			
			// 첫번째 점수를 기준으로 오름차순 정렬
            Arrays.sort(score, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
			
			// 두 번째 점수가 현재 지원자보다 작은 경우를 count
            int count=1;
            int min = score[0][1];
			for(int j=1; j<N; j++) {
				if(score[j][1] < min) {
					min = score[j][1];
					count++;
				}
			}

			bw.write(String.valueOf(count)+"\n");	
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}