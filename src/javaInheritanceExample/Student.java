package javaInheritanceExample;

public class Student extends User{
	private String section;
	private String [] courses;

	public Student() {
		super();
	}

	public Student(String section, String[] courses) {
		super();
		this.section = section;
		this.courses = courses;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}


}
