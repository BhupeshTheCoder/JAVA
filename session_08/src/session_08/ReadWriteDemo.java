package session_08;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class ReadWriteDemo {
	public static void main(String[] args) throws IOException {	
		InputStream fis = null;
		OutputStream fos = null;
		int x = 0;
		try
		{
			//File f1 = new File("z://mno.txt");
			File f2 = new File("z://abc.txt");
			
			//fis = new FileInputStream(f1);
			fis = new FileInputStream("z://mno.txt");
			fos = new FileOutputStream(f2);
			
			/*while((x =fis.read())!=-1)
			{
				System.out.print((char)x);
			}*/
			
			do
			{
				x = fis.read();
				fos.write(x);
			}while(x!=-1);
			
			System.out.println("Success!!!");
			
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			fis.close();
			fos.close();
		}	
	}
}
