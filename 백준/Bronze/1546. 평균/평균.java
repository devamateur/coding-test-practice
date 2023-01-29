import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] subjects = new double[n];
        double max = 0;
        double sum = 0;
        
        for(int i=0; i<n; i++){
            subjects[i] = s.nextInt();
            
            if(subjects[i] > max)
                max = subjects[i];
        }
        s.close();
        
        for(double sub : subjects){        // 새로운 점수
            sum += (sub/max)*100;
        }

        System.out.println(sum/subjects.length);
    }
}