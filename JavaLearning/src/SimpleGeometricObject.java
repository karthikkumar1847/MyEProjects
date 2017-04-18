public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;	//data fields

	public SimpleGeometricObject() {		//constructor
	dateCreated = new java.util.Date();// date constructed
	}
	
	public SimpleGeometricObject(String color,boolean filled) {		              //constructor
		dateCreated = new java.util.Date();	
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isFilled(){						    // accessor(get) method for filled
		return filled;
	}
	
	public void setFilled(boolean filled){			// mutator(set) method for filled
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	
public String toString(){						    // Return a string representation of this object
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}

