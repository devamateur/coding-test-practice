import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sec = 0;

        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch - 'A' <= 2)
                sec += 3;
            else if(ch - 'A' <= 5)
                sec += 4;
            else if(ch - 'A' <= 8)
                sec += 5;
            else if(ch - 'A' <= 11)
                sec += 6;
            else if(ch - 'A' <= 14)
                sec += 7;
            else if(ch - 'A' <= 18)
                sec += 8;
            else if(ch - 'A' <= 21)
                sec += 9;
            else if(ch - 'A' <= 25)
                sec += 10;
        }
        
        System.out.println(sec);
    }
}