package IODemos;
import java.io.File;
import java.io.IOException;
public class FileDemo {
	File f;
	public FileDemo() throws IOException
	{
		f = new File("z://abc.txt");
		if(f.exists() == true)
		{
			System.out.println("File Exists");
		}
		else
		{
			f.createNewFile();
			System.out.println("File Created!!!");
		}
		
		System.out.println("Path = "+f.getPath());
		System.out.println("Size = "+f.length());
		
		if(f.canRead() == true)
		{
			System.out.println("Read Access");
		}
		
		if(f.canWrite() == true)
		{
			System.out.println("Write Access");
		}	
	}
	public static void main(String[] args) throws IOException {
		FileDemo d = new FileDemo();	
	}
}
