import java.util.Date;
public class CircleWithPrivateDataFields {
		
		private double radius = 1;                            //radius of the circle
		private static int numberOfObjects = 10;                   //static variable
		private Date date;
		
		
		public CircleWithPrivateDataFields() {                 //construct a circle with radius 1
		
			numberOfObjects++;
			 date= new Date();
			
		}
		
		public CircleWithPrivateDataFields(double newRadius) {              //construct a circle with specified radius
			radius = newRadius;
			numberOfObjects++;
			date= new Date();
		}
		
		public double getRadius() {           // accessor method
			return radius;
		}
		
		public static int getNumberOfObjects() {        //accessor method 
			return numberOfObjects;
		}
		
		public void setRadius(double newRadius){            // mutator method
			radius = (newRadius >= 0) ? newRadius : 0;

		}

		public double getArea() {
			return radius*radius*Math.PI;
		}
	public String toString(){
		
		return "Object created on "+ date;
	
	}
}

