package Handling;
import java.util.regex.Pattern;
public class SplitDemo {
	
	


		
		public static void main(String[] args) {
			
			String s = "Core Java is base";
			//String str[] = s.split("\\s");
			String str[] = s.split("b");
			for(String i:str)
			{
				System.out.println(i);
			}	
		}
}
