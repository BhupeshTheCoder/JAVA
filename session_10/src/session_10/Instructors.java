package session_10;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	
	public static List<Instructor> getAll()
	{
		Instructor instructor1 = new Instructor("MAyuri", 10, "Java Trainer", "Female", true, 
				Arrays.asList("Java","Servlet","Microserves","SAG"));
		Instructor instructor2 = new Instructor("Rahul", 4, "Software Engineer", "male", false, 
				Arrays.asList("C++","JSP","Python","React"));
		Instructor instructor3 = new Instructor("Ajinkya", 15, "Backend Developer", "male", true,
				Arrays.asList("DB","MongoDB","MySQL","SQLite"));
		Instructor instructor4 = new Instructor("Poonam", 3, "Full Stack Developer", "Female", true, 
				Arrays.asList("UI","Java","JS","Testing"));
		Instructor instructor5 = new Instructor("Dhruv", 11, "IOS", "male", false, 
				Arrays.asList("Swift","flutter","Android","SpringBoot"));
		
		List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
		
		return list;	
	}
}
