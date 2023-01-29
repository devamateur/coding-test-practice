import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();
        
        if(minute >= 45)
            minute -= 45;
        else{
            hour--;
            if(hour < 0)
                hour = 23;
            minute = 60 - (45 - minute);
        }
        
        System.out.println(hour + " " + minute);
    }
}