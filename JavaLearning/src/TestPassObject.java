
public class TestPassObject {

	public static void main(String[] args) {
		// Create a circle with radius 1
		CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
		System.out.println(c1.toString());
		System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());
		CircleWithPrivateDataFields c2 = new CircleWithPrivateDataFields(5);
		System.out.println(c2.toString());
		// print areas for radius 1,2,3,4,5
		int n = 5;
		printAreas(c1,n);            //pass object
		
		System.out.println("The value of radius: " + c1.getRadius() + "\n" + "n is " + n);  // after invoking printAreas method
	}
	
	public static void printAreas(CircleWithPrivateDataFields c, int times){
		System.out.println("Radius \t \t Area");
		System.out.println(times);
		
		while(times>=1){
			System.out.println(c.getRadius() + " \t \t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
		System.out.println("times"+ times);
		
	}
}


