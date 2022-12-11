package swea;

import java.util.Scanner;

public class Prob2056 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		
		String year="", month="", days = "";
		String result = "";
		for(int test_case = 1; test_case <= T; test_case++)
		{
			year=""; month=""; days = "";
			String calendar = sc.nextLine();
			
			// 년
			year += calendar.substring(0, 4);
			int newYear = Integer.parseInt(year);
			
			// 월
			month += calendar.substring(4, 6);
			int newMonth = Integer.parseInt(month);

			
			// 일
			days += calendar.substring(6, 8);
			int newDays = Integer.parseInt(days);
			result = "#"+test_case+" "+year+"/"+month+"/"+days;

			if(newMonth < 1 || newMonth > 12)
				result = "#"+test_case+" -1";
			
			else if(newMonth == 4 || newMonth == 6 || newMonth == 9 || newMonth == 11) {
				
				if(newDays > 30 || newDays < 1) {
					result = "#"+test_case+" -1";
				}
			}
			else if(newMonth == 2) {
				if(newDays > 28 || newDays < 1) {
					result = "#"+test_case+" -1";
				}
			}
			else {
				if(newDays > 31 || newDays < 1) {
					result = "#"+test_case+" -1";
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}
