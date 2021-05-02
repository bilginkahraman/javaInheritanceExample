package javaInheritanceExample;

public class Instructor extends User {
	private String expertise;
	private String name;
	private String department;
	private String officeNumber;
	private int quantityOfLectureInAWeek;

	public Instructor() {
		super();
	}

	public Instructor(String expertise, String department, String officeNumber, int quantityOfLectureInAWeek,String name) {
		super();
		this.expertise = expertise;
		this.name = name;
		this.department = department;
		this.officeNumber = officeNumber;
		this.quantityOfLectureInAWeek = quantityOfLectureInAWeek;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public int getQuantityOfLectureInAWeek() {
		return quantityOfLectureInAWeek;
	}

	public void setQuantityOfLectureInAWeek(int quantityOfLectureInAWeek) {
		this.quantityOfLectureInAWeek = quantityOfLectureInAWeek;
	}

}
