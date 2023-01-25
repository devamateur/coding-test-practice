import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] array = new int[9][9];
	
	public static void main(String[] args) throws IOException{
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
				
		dfs(0, 0);
		
		br.close();
	}
	
	static void dfs(int row, int col) throws IOException{
		
		if(col == 9) {		// 해당 행이 다 채워진 경우 다음 행 탐색
			dfs(row + 1, 0);
			return;
		}
		
		if(row == 9) {		// 모든 행, 열이 다 채워진 경우 출력
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					bw.write(String.valueOf(array[i][j]) + " ");
				}
				bw.write("\n");
			}
			
			bw.flush();
			bw.close();
			System.exit(0);
		}
		
		if (array[row][col] == 0) {		// 값이 비어있으면 1부터 9까지 가능한 값 탐색
			for (int i = 1; i <= 9; i++) {
				if (bound(row, col, i)) {		// i값 중복여부 검사
					array[row][col] = i;
					dfs(row, col + 1);
				}
			}
			array[row][col] = 0;
			return;
		}
 
		dfs(row, col + 1);
	}
	
	static boolean bound(int row, int col, int value) {
		
	    for (int i=0; i<9; i++) {
	    	if(array[row][i] == value) return false;
	    }
	    
	    for(int i=0; i<9; i++) {
	    	if(array[i][col] == value) return false;
	    }
	    
	    int row_square = (row/3)*3;
	    int col_square = (col/3)*3;
	    
		for (int i=row_square; i<row_square+3; i++) {
			for (int j=col_square; j<col_square+3; j++) {
				if (array[i][j] == value) {
					return false;
				}
			}
		}
	    return true;
	}
}