public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private  double radius;

	public CircleFromSimpleGeometricObject() {
		super();
	}
	
	public CircleFromSimpleGeometricObject(double radius) {					//constructor
	    this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color,boolean filled) {		//constructor
		super(color,filled);						
		this.radius = radius;
	}
	
	public double getRadius() {		// accessor method
		return radius;
	}
	
	public void setRadius(double radius) {					// mutator method
		this.radius = radius;
	}
	
	public double getArea() {					
		return radius *radius * Math.PI;
	}
	
	public double getDiameter() {					
		return radius * 2;
	}
	
	public double getPerimeter() {					
		return radius * 2 * Math.PI;
	}
   
	public void printCircle() {	//print the circle info		
		System.out.println("The circle was created " + getDateCreated() + " and the radius is "+ radius);
	}
	@Override
	public String toString(){						    // Return a string representation of this object
		return super.toString()+" Circle class Objct";
	}
}
