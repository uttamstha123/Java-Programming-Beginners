class Vehicle{
	int maxSpeed = 120;
	Vehicle(){
		System.out.println("Vehicle Constructor");
	}
	
}
class Car extends Vehicle{
	int maxSpeed = 100;
	Car(int maxSpeed){
		super(); // With constructor
		this.maxSpeed = maxSpeed;
	}
	public void display() {
		System.out.println(super.maxSpeed); // With variables
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Car c = new Car(80);
		c.display();
	}
}
