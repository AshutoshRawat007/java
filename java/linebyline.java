import java.io.BufferedReader;
import java.io.InputStreamReader;

public class linebyline {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader("D:/CODES/VsCode/java/file.txt");
        BufferedReader br=new BufferedReader(isr);
        String s;
        while((s=br.readLine)!=null)
        {
            System.out.println(s);
        }
    }
    
}
