import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = " ";
        
        for(int i=0; i<n; i++){
            int repeat = sc.nextInt();
            s = sc.next();
            
            for(int j=0; j<s.length(); j++){
            	for(int k=0; k<repeat; k++)
            		System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}