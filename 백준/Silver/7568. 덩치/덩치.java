import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] kg = new int[n];
		int[] cm = new int[n];
		int[] rank = new int[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			kg[i] = Integer.parseInt(st.nextToken());
			cm[i] = Integer.parseInt(st.nextToken());
			rank[i] = 1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(kg[i] > kg[j] && cm[i] > cm[j])
					rank[j] += 1;
				else if(kg[j] > kg[i] && cm[j] > cm[i])
					rank[i] += 1;
			}
		}
		
		for(int i=0; i<n; i++)
			bw.write(String.valueOf(rank[i]) + " ");
		
		br.close();
		bw.flush();
		bw.close();
	}
}