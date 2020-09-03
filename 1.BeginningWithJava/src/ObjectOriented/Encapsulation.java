package ObjectOriented;

public class Encapsulation {
	// encapsulation means to protect the direct access of variable by the users
	// so make these variables private
	private String name;
    private int age;
	
    // How to access these variable
    // Create set and get method
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public int getAge() {
    	return this.age;
    }
	
}