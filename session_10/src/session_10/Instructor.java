package session_10;

import java.util.List;
public class Instructor {
	
	String name;
	int yrsOfExp;
	String title;
	String gender;
	boolean onlineCourse;
	List<String> courses;
	
	public Instructor(String name, int yrsOfExp, String title, String gender, boolean onlineCourse,
			List<String> courses) {
		super();
		this.name = name;
		this.yrsOfExp = yrsOfExp;
		this.title = title;
		this.gender = gender;
		this.onlineCourse = onlineCourse;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", yrsOfExp=" + yrsOfExp + ", title=" + title + ", gender=" + gender
				+ ", onlineCourse=" + onlineCourse + ", courses=" + courses + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYrsOfExp() {
		return yrsOfExp;
	}

	public void setYrsOfExp(int yrsOfExp) {
		this.yrsOfExp = yrsOfExp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isOnlineCourse() {
		return onlineCourse;
	}

	public void setOnlineCourse(boolean onlineCourse) {
		this.onlineCourse = onlineCourse;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	

}
