import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = new String[sc.nextInt()];
    
        for(int i=0; i<s.length; i++){
            s[i] = sc.next();
        }
        sc.close();
        
        for(int i=0; i<s.length; i++){
            int score = 0;
            int sum = 0;
            for(int j=0; j<s[i].length(); j++){
                if(s[i].charAt(j) == 'O'){
                    score++;
                }
                else
                    score = 0;
                sum += score;
            }
            System.out.println(sum);
        }
    }
}