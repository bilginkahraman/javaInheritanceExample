package javaInheritanceExample;

public class StudentManager {

	public void addCourses(String[] courses, Student student) {

		for (String course : courses) {
			System.out.println(student.getId() + "id'li ogrenciye" + course + "dersler eklendi");

		}

	}

}
