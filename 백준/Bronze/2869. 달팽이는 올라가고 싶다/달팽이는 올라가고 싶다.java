import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int climb = Integer.parseInt(st.nextToken());
		int slip = Integer.parseInt(st.nextToken());
		int tree = Integer.parseInt(st.nextToken());
		
		int days = (tree - slip) / (climb - slip);
		
		if((tree - slip) % (climb - slip) != 0)
			days++;
		
		br.close();

		bw.write(String.valueOf(days));
		bw.flush();
		bw.close();
	}
}