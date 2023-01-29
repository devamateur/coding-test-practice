import java.util.Scanner;
class Main{
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
        String reverse1 = "";
        String reverse2 = "";
        
        for(int i=input1.length(); i>0; i--) {
        	reverse1 += input1.charAt(i-1);
        }
        
        for(int j=input2.length(); j>0; j--) {
        	reverse2 += input2.charAt(j-1);
        }
        
        System.out.println(Integer.parseInt(reverse1) > Integer.parseInt(reverse2) ? reverse1 : reverse2);

    }
}