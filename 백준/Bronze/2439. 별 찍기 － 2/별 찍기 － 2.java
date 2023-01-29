import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int starNum = s.nextInt();
        
        for(int i=0; i< starNum; i++){
            for(int j=0; j<starNum-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}