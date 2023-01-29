import java.io.*;

/* 택시 기하학 */
public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double radius = Double.parseDouble(br.readLine());
		
		br.close();

		System.out.printf("%.6f\n", radius*radius*Math.PI);
		System.out.printf("%.6f\n", radius*radius*2.0);
	}
}