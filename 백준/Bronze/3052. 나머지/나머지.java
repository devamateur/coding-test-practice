import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 1;
        
        for(int i=0; i<numbers.length; i++){
            numbers[i] = s.nextInt() % 42;
        }
        
        Arrays.sort(numbers);
        for(int i=0; i<9; i++){
            if(numbers[i] != numbers[i+1]){
                count ++;
            }
        }
        System.out.println(count);
    }
}