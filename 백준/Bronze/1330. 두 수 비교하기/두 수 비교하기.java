import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        
        StringTokenizer st = new StringTokenizer(s, " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a>b ? ">" : a<b ? "<" : "==" );
    }
}