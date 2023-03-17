import java.util.Scanner;

/* 15904. UCPC는 무엇의 약자일까? */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
	
		String ucpc="";
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i) == 'U') && ucpc.equals("")) {
				ucpc += "U";
			}
			else if((str.charAt(i) == 'C') && (ucpc.equals("U") || ucpc.equals("UCP"))) {
				ucpc += "C";

			}
			else if((str.charAt(i) == 'P') && ucpc.equals("UC")) {
				ucpc += "P";
			}	
			if(ucpc.equals("UCPC")) {
				break;
			}
		}
		
		if(ucpc.equals("UCPC")) {
			System.out.println("I love UCPC");
		}
		else {
			System.out.println("I hate UCPC");
		}
		
		sc.close();
	}
}
