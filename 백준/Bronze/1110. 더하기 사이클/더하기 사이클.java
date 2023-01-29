import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int copy = n;
        
        sc.close();
        
        while(true){
            n = ((n%10)*10) + (((n/10) + (n%10))%10);
            count++;
            
            if(n == copy)
                break;
        }
        
        System.out.println(count);
    }
}