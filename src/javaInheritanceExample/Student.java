package javaInheritanceExample;

public class Student extends User{
	private String section;
	private String firstName;
	private String lastName;
	private boolean isExpat;




	public Student() {
		super();
	}

	public Student(String section, String firstName, String lastName, boolean isExpat) {
		super();
		this.section = section;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isExpat = isExpat;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isExpat() {
		return isExpat;
	}

	public void setExpat(boolean isExpat) {
		this.isExpat = isExpat;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	

}
