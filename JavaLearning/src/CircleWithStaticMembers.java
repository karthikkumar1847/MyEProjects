public class CircleWithStaticMembers {
	
	double radius;                                //radius of the circle
	private static int numberOfObjects = 0;               //static variable

	public CircleWithStaticMembers() {                
       //construct a circle with radius 1
		radius = 1;
		numberOfObjects++;
	}
	
	public CircleWithStaticMembers(double newRadius) {                                    //construct a circle with specified radius
		radius = newRadius;
		numberOfObjects++;
	}
	
	public static int getNumberOfObjects() {                //static method
		return numberOfObjects;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
}

