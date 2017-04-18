
public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     displayObject(new CircleFromSimpleGeometricObject(1));
	     displayObject(new RectanglefromSimpleGeometricObject(1,2,"black",true));
	}
	
	  public static void displayObject(SimpleGeometricObject object) {
	    System.out.println("Created on " + object.toString() + ". Color is " + object.getColor());
	  }

}
