package javaInheritanceExample;

public class UserManager  {
	
	public void add(User user) {
		System.out.println(user.getId()+" Id'li kullan�c� kaydedildi");
		
	}
	
	public void addMultiple(User[] userArray) {
		for (User user : userArray) {
			add(user);
		}
	}

}
