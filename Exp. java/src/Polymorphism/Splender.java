package Polymorphism;

public class Splender extends Bike { //is a relationship
public void run() {
	System.out.println(" Splendor runs with the speed of 60 km/hr ");
}
	public static void main(String[] args) {
	 Bike b=new Splender();//upcasting
	 b.run(); //overriding
	}

}
