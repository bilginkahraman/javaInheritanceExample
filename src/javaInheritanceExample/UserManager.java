package javaInheritanceExample;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+"kaydedildi");
		System.out.println(user.getFirstName()+"kaydedildi");
		System.out.println(user.getLastName()+"kaydedildi");
		
	}
	
	public void addMultiple(User[] userArray) {
		for (User user : userArray) {
			add(user);
			
		}
	}

}
