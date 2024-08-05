package session_10;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		
		//display all instructors
		Consumer<Instructor> c = (s) -> System.out.println(s);
		instructors.forEach(c);
		
		//display name of instructors
		Consumer<Instructor> c1 = (s) -> System.out.println(s.getName());
		instructors.forEach(c1);
		
		/*
		 * System.out.println("Instrcutors ABove 10 years of experience----------> ");
		 * //display all instructors name who have 10 years above experience
		 * instructors.forEach(s -> { if(s.getYrsOfExp()>10) c1.accept(s); });
		 */
		
		//display all instructors name and title -  yrs_of_exp above 10
		System.out.println("display all instructors name and title -  yrs_of_exp above 10------>");
		Consumer<Instructor> c2 = (s) -> System.out.println(s.getYrsOfExp());
		instructors.forEach(
				
				a -> 
				{
					if(a.getYrsOfExp()>=10)
						c2.accept(a);
				}
				
				);
		
		
		//display all instructors who takes onlineCourse and 10+ experience
		Consumer<Instructor> c3 = (s)->System.out.println(s);
		instructors.forEach(	
				b ->
				{
					if(b.isOnlineCourse() && b.getYrsOfExp()>10)
						c3.accept(b);
				}
				);
		
//Consumer<Instructor> c3 = (s)->System.out.println(s.getName()+" "+s.getYrsOfExp());
		
		System.out.println("----------------------->");
		instructors.forEach(	
				b ->
				{
					c1.andThen(c2).accept(b);
				}
				);
		
		
		
		
		
		
		
	}

}
