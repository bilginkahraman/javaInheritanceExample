package javaInheritanceExample;

public class InstructorManager {
	public void updateQuantityOfLecture(Instructor instructor) {
		System.out.println(instructor.getId() + "Id li" + instructor.getName() +

				"  ad�ndaki egitmen haftal�k ders saatini "

				+ instructor.getQuantityOfLectureInAWeek() +

				"ders saati olarak degi�tirdi");

	}

}
