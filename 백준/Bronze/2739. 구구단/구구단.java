import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=0; i<9; i++){
            System.out.println(n + " * " + (i+1) + " = " + n*(i+1));
        }
    }
}