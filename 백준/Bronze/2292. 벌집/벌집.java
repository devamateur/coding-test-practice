import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int roomNum = Integer.parseInt(br.readLine());
        int layer = 1;        // 벌집의 겹
        int numberRange = 1;		// 겹에 해당하는 숫자들의 범위 ex) 1겹: 1(1개), 2겹: 2~7(6개), 3겹: 8~19(12개)
        int multipleSix = 1;
        
        while(numberRange < roomNum){
            multipleSix = 6*layer;
            numberRange += multipleSix;
            layer++;
        }
        
        System.out.println(layer);       
    }
}