package javaInheritanceExample;

public class InstructorManager {
	public void addCourses(String[] courses, Instructor instructor) {

		for (String course : courses) {
			System.out.println(instructor.getId() + "id'li egitmene " + course + "dersler eklendi");

		}

	}

}
