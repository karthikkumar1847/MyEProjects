public class TestCircleWithStaticMembers {

  public static void main(String[] args) {
	System.out.println("Before creating objects the number of Circle objects is " + CircleWithStaticMembers.getNumberOfObjects());
	
	CircleWithStaticMembers c1 = new CircleWithStaticMembers();             // create c1
	System.out.println("After creating c1 the number of Circle objects is " + CircleWithStaticMembers.getNumberOfObjects());
	System.out.println("c1 radius: " + c1.radius);
	
	CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);        // create c2
	System.out.println("After creating c2 the number of Circle objects is " + c1.getNumberOfObjects());
	System.out.println("c2 radius: " + c2.radius);
	
	c1.radius = 9;             // Modify c1
	System.out.println("After modifying c1 the number of Circle objects is " + CircleWithStaticMembers.getNumberOfObjects());
	System.out.println("c1 radius: " + c1.radius);
	
	CircleWithStaticMembers c3 = new CircleWithStaticMembers(15);  
	}

}
