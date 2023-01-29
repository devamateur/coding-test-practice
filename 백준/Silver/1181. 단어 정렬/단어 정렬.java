import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];
		
		for(int i=0; i<n; i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length())		// 길이가 같은 경우
					return o1.compareTo(o2);		// 사전 순으로 정렬
				else 
					return o1.length() - o2.length();		// 길이를 비교
			}
			
		});
		
		for (int i=0; i<n-1; i++) {
			if (!words[i].equals(words[i+1])) {		// 중복 제거
				bw.write(words[i] + "\n");
			}
		}
		bw.write(words[n-1] + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}