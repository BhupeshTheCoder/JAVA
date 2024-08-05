package IODemos;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessDemo {
	public static void main(String[] args) throws IOException {
		int x = 0;
		File f1 = new File("z://abc.txt");
		
		RandomAccessFile raf1 = new RandomAccessFile(f1, "r");
		RandomAccessFile raf2 = new RandomAccessFile(new File("z://mno.txt"), "rw");
		
		System.out.println("File Pointer Position = "+raf1.getFilePointer());
		raf1.seek(3);
		System.out.println("After Seek : "+raf1.getFilePointer());
		do
		{
			x = raf1.read();
			raf2.write(x);
		}while(x!=-1);
		
		raf1.close();
		raf2.close();	
	}
}
