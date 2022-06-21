import java.io.*;
public class bytebyte{
    public static void main(String[] args)throws IOException {
        FileInputStream fis =new FileIntputStream("C:\\Users\\User\\Pictures\\Screenshots\\file.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int i=0;

        FileOutputStream fos=new FileOutputStream("C:\\Users\\User\\Pictures\\Screenshots\\file2.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        while((i=bis.read())!=-1)
        {
            bos.write((char)i);
        }
        fis.close();bis.close();fos.close();bos.close();
    }
}
