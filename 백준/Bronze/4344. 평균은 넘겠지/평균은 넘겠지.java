import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] scores = {};
        double percent = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            double avg = 1;
            double count = 0;
            
        	scores = new int[s.nextInt()];
        	for(int j=0; j<scores.length; j++) {
                scores[j] = s.nextInt();
                sum += scores[j];
        	}
        	avg = sum/scores.length;

        	for(int k=0; k<scores.length; k++) {
            	if(scores[k] > avg)
            		count++;
        	}

        	percent = (count/scores.length)*100;
        	System.out.printf("%.3f", percent);
        	System.out.println("%");

        }
    }
}