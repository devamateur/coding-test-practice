import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        
        System.out.println(st.countTokens());
    }
}