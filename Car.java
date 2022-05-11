package week1.day2;

public class Car {
	public void applyBreak() {
		System.out.println("Break");
	}
	public void applyGear() {
		System.out.println("Gear");
	}
	public void switchonAc() {
		System.out.println("Ac");
	}
	public void applyAcclerate() {
		System.out.println("Acclerate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car();
		ob.applyAcclerate();
		ob.applyBreak();
		ob.applyGear();
		ob.switchonAc();

	}

}
