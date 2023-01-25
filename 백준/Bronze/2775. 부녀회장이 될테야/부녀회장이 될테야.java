import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int floor = 0;
		int room = 0;
		int[][] rooms = new int[15][15];
		
		for(int i=0; i<rooms.length; i++) {
			rooms[0][i] = i;
			rooms[i][1] = 1;
		}
		
		for(int i=1; i<rooms.length; i++) {
			for(int j=2; j<rooms[i].length; j++) {
				rooms[i][j] = rooms[i][j - 1] + rooms[i - 1][j];
			}
		}
		
		StringBuilder sb = new StringBuilder();		
		for(int i=0; i<n; i++) {
			floor = Integer.parseInt(br.readLine());
			room = Integer.parseInt(br.readLine());
			sb.append(rooms[floor][room]).append('\n');
		}
		System.out.println(sb);
		
	}

}