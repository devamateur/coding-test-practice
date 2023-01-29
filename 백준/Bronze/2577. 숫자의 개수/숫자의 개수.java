import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        String multi = String.valueOf(x*y*z);
        int[] countNum = new int[10];
        s.close();
        
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < multi.length(); j++) {
				if ((multi.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
    }
}