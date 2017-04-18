class SimpleCircle {
		private double radius;
		
		//construct a circle with radius 1
		SimpleCircle() {				// no-arg constructor
			radius =1;                            
		}
		
		//construct a circle with specified radius
	    SimpleCircle(double newRadius) {        // second constructor
			radius = newRadius;
		}
		
		//Return area of this circle
		public double getArea() {
			return radius*radius*Math.PI;
		}
		
		// Return perimeter
		public double getPerimeter() {
			return radius*2*Math.PI;
		}
		
		// Set a new radius for this circle
		public void setRadius(double newRadius) {
			radius = newRadius;
		}
		public  double getRadius(){
			
			return radius;
		}
}

