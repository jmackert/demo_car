package demo_cars;

public class Car {
	String bodyStyle;
	String tires;
	String color;
	String engine;
	String transmisson;
	String radio;
	int coolantTemp = 80;
	
	public Car(String bodyStyle, String tires, String color, String engine, String transmisson, String radio) {
		this.bodyStyle = bodyStyle;
		this.tires = tires;
		this.color = color;
		this.engine = engine;
		this.transmisson = transmisson;
		this.radio = radio;
	}
	
	public void drive() {
		System.out.println("The car is going somewhere");
	}
	public void playsMusic() {
		System.out.println("The car is playing music");
	}
	public int checkCoolantTemp() {
		return coolantTemp;
	}
	public void turnOnAc() {
		System.out.println("The AC is on");
	}
	public void starts() {
		System.out.println("The car has started");
	}
}
