
@MyAnnotation(info="Demo is user-defined class. Example of User-defined Annotation")
public class Demo 
	{
	
	@MyAnnotation(info="instance variable")
	int no = 111;
	
	@MyAnnotation(info="return type void")
	public void getNo()
	{
		System.out.println(no);
	}
	
	
	

}
