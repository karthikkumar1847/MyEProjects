import java.util.Scanner;

public class TestSimpleCircle {
	public static void main(String[] args) {
		// create a circle object with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		
	
		System.out.println("The area of the circle of radius " + circle1.getRadius() + " is " + circle1.getArea());
		
		// create a circle object of radius 25
		Scanner scan = new Scanner(System.in);
		
		
		SimpleCircle circle2 = new SimpleCircle(scan.nextDouble());
		SimpleCircle circle3 = new SimpleCircle(35);
		SimpleCircle circle4 = new SimpleCircle(365);
		SimpleCircle circle5 = new SimpleCircle(55);
		System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());
	
		
		//modify circle radius
		circle2.setRadius(100);
		
		System.out.println("The area of the circle of radius " + circle2.getRadius() + "," + circle2.getArea());
		
		circle2.setRadius(1000);
		
		
		System.out.println("Radius of circle 2 is "+circle2.getRadius());
	}
}

