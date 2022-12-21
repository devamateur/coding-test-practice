package swea.d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Prob2063 {

	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));


		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		List<String> findMiddle = new ArrayList<>();

		{
			findMiddle = Arrays.asList(sc.nextLine().split(" "));
		}
		
		findMiddle = findMiddle.stream().distinct().collect(Collectors.toList());	 // 중복 제거
		Collections.sort(findMiddle);		// 정렬
		
		System.out.println(findMiddle.get(findMiddle.size()/2-1));
		
	}
}
