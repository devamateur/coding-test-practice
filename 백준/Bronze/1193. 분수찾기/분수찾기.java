import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nth = Integer.parseInt(br.readLine());
		int x=1, y=1;
		int trys = 1;
		boolean downSearch = false;
        boolean upSearch = false;
		
		br.close();
		
		while(trys != nth) {
			
			if(upSearch) {
				if (x-1 == 0) {		// 분자가 1인 경우에는 위로 이동하지 X
                    upSearch = false;
                    continue;
				}
				else {
					x--;
					y++;
					trys++;
					continue;
				}

			}
			
			if(downSearch) {
				if(y-1 == 0){		// 분모가 1인 경우는 아래 방향으로 이동하지 X
					downSearch = false;
					continue;
				}
				else {
					y--;
					x++;
					trys++;
					continue;
				}
			}
			
			if(x==1) {
				y++;
				downSearch = true;
				trys++;
				continue;
			}
			else if(y==1) {
				x++;
				upSearch = true;
				trys++;
				continue;
			}
		}
		
		bw.write(String.valueOf(x + "/" + y));
		bw.flush();
		bw.close();
	}
}