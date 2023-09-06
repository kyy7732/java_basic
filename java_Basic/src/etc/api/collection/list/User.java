package etc.api.collection.list;

public class User {

	private String name;
	private int age;
	
	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "이름: " + name + "  나이: " + age + "세";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
