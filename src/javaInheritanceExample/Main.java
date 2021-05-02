package javaInheritanceExample;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		Instructor instuctor=new Instructor();
		instuctor.setId(1);
		instuctor.setName("Engin");
		instuctor.setDepartment("Software");
		instuctor.setEmail("engndemirog@gmail.coms");
		instuctor.setOfficeNumber("Ankara 123");
		instuctor.setExpertise("web development");
		instuctor.setQuantityOfLectureInAWeek(5);
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Bilgin");
		student.setLastName("Kahraman");
		student.setSection("Software");
		student.setAdress("Ankara 123");
		student.setExpat(false);
		student.setEmail("asdad@gmail.coms");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setFirstName("El-Habibi");
		student1.setLastName("George");
		student1.setSection("Chemistry");
		student1.setAdress("Belgium 123");
		student1.setExpat(true);
		student1.setEmail("asdad@gmail.coms");
		
		 
		User [] users1 = {instuctor,student};
		userManager.addMultiple(users1);
		userManager.add(student1);
		instructorManager.updateQuantityOfLecture(instuctor);
		student1.setSection("Physics");
		studentManager.updateSection(student1);
		
		
		

	}

}
