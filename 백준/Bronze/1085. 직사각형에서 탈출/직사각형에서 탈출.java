import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int distance = 0;
		
		br.close();
		
		while(st.hasMoreTokens()) {
			int currentX = Integer.parseInt(st.nextToken());
			int currentY = Integer.parseInt(st.nextToken());
			int boundX = Integer.parseInt(st.nextToken());
			int boundY = Integer.parseInt(st.nextToken());
			
			distance = Math.abs(currentX - 0);
			
			if(Math.abs(currentY - 0) < distance)
				distance = Math.abs(currentY - 0);
			if(Math.abs(boundY - currentY) < distance)
				distance = Math.abs(boundY - currentY);
			if(Math.abs(boundX - currentX) < distance)
				distance = Math.abs(boundX - currentX);
		}
		bw.write(String.valueOf(distance));
		bw.close();
	}
}