package javaInheritanceExample;

public class Instructor extends User {
	private String expertise;
	private String[] courses;

	public Instructor() {

	}

	public Instructor(String expertise, String[] courses) {
		super();
		this.expertise = expertise;
		this.courses = courses;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

}
