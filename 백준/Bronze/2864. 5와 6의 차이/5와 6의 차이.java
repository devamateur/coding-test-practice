import java.util.Scanner;

/* 2864. 5와 6의 차이 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = Integer.toString(sc.nextInt());
		String b = Integer.toString(sc.nextInt());

		String[] newNum = new String[4];
		
		for(int i=0; i<newNum.length; i++) {
			newNum[i] = "";
		}
		
		for(int i=0; i<a.length(); i++) {

			if(a.charAt(i) == '5' || a.charAt(i) == '6') {
				newNum[0] += "6";
				newNum[1] += "5";
			}
			else {
				newNum[0] += a.charAt(i)+"";
				newNum[1] += a.charAt(i)+"";
			}
		}
		
		for(int i=0; i<b.length(); i++) {

			if(b.charAt(i) == '5' || b.charAt(i) == '6') {
				newNum[2] += '6';
				newNum[3] += '5';
			}
			else {
				newNum[2] += b.charAt(i);
				newNum[3] += b.charAt(i);
			}
		}
		
		int max=0, min=0;
		
		max = Integer.parseInt(newNum[0])+Integer.parseInt(newNum[2]);
		min = Integer.parseInt(newNum[1])+Integer.parseInt(newNum[3]);
		
		System.out.println(min+" "+max);
	
		sc.close();
	}
}