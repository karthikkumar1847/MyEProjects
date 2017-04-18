package AbstractPrograms;

public class TestGO2 {

	public static void main(String[] args ) {
	    Rectangle rectangle = new Rectangle(2, 2);
	    Circle circle = new Circle(2);
	    TestGeometricObject tog = new TestGeometricObject();
	    System.out.println("Same area? " + equalArea(circle,rectangle ));
	}

	public static <E extends GeometricObject> boolean     
	       equalArea(E object1, E object2) {
	    return object1.getArea() == object2.getArea();
	}


}
