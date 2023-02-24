import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 11729. 하노이 탑 이동 순서 */
// Scanner 사용 시 시간초과..
public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());		 // 첫 번째 장대에 있는 원판의 개수
				
		// 하노이 탑 최소 이동 횟수 = 2의 원판갯수 제곱 - 1
		bw.write((int)Math.pow(2, N)-1 + "\n");
		hanoi(N, 1, 2, 3);

		br.close();
		bw.flush();
		bw.close();
	}
	
	// from: 출발점, mid: 중간 도착지점(경유지), to: 도착점
	static void hanoi(int n, int from, int mid, int to) throws IOException {		
		if(n == 1) {
			bw.write(from+" "+to+"\n");
		}
		else {
			hanoi(n-1, from, to, mid);				// 1. 제일 큰 맨 밑 원판을 제외한 n-1개 원판을 2번째 장대로 옮김
			bw.write(from+" "+to+"\n");				// 2. 제일 큰 원판을 1번에서 3번으로 옮김
			hanoi(n-1, mid, from, to);				// 3. 2번째 장대에 있는 n-1개 원판을 3번으로 옮김 
		}
	}
}