public class RectanglefromSimpleGeometricObject extends SimpleGeometricObject {
	private  double height, width;

	public RectanglefromSimpleGeometricObject() {
	}
	
	public RectanglefromSimpleGeometricObject(double height,double width) {					//constructor
			this.width = width;
			this.height = height;
		}
		
	public RectanglefromSimpleGeometricObject (double height,double width,String color, boolean filled) {					//constructor
		super(color,filled);	
		this.width = width;
		this.height = height;
	}
		
		public double getWidth() {					// accessor method
			return width;
		}
		
		public void setWidth(double width) {					// mutator method
			this.width = width;
		}
		
		public double getHeight() {					// accessor method
			return height;
		}
		
		public void setHeight(double height) {					// mutator method
			this.height = height;
		}
		
		public double getArea() {					
			return width * height;
		}
		
		public double getPerimeter() {					
			return  2 * (width + height);
		}
	   
	}

