package Pack4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\Users\\Group055\\Desktop");
		File f2 = new File("C:\\Users\\Group055\\Desktop");
		
		RandomAccessFile raf1 = new RandomAccessFile(f1,"r");
		RandomAccessFile raf2 = new RandomAccessFile(f1,"rw");
		System.out.println("Before..."+raf1.getFilePointer());
		raf1.seek(3);
		System.out.println("After..."+raf1.getFilePointer());
		int x =0;
		
		do {
			x = raf1.read();
			raf2.write(x);
			}while(x!=-1);
		
		}
	}


