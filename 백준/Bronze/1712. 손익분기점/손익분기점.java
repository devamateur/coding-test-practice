import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fixed = sc.nextInt();
        int variable = sc.nextInt();
        int price = sc.nextInt();
        
        if(price <= variable)
        {
            System.out.print("-1");    
        }
        
        else
        {
            System.out.print((fixed / (price - variable)) + 1);		// 나머지를 +1
        }
    }
}