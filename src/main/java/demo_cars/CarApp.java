package demo_cars;

public class CarApp {

	public static void main(String[] args) {
		Car myCar = new Car("Sedan","Good Year","Black","4 Cylinder","Automatic","Bose");
		Car yourCar = new Car("Sedan","Yokohama","White","4 Cylinder","Manual","Sony");
		
		myCar.starts();
		myCar.drive();
		System.out.println(myCar.checkCoolantTemp());
		yourCar.starts();
		yourCar.turnOnAc();

	}

}
