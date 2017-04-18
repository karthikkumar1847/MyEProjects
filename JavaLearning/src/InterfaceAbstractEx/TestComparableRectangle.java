package InterfaceAbstractEx;

public class TestComparableRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComparableRectangle r1 = new ComparableRectangle(1,2);
		ComparableRectangle r2 = new ComparableRectangle(2,1);
		
		Rectangle r = new Rectangle(2,5);
		
		System.out.println(max(r1,r2));
		System.out.println(max(235,456));
		
	}
	  public static <E extends Comparable<E>> E max(E o1, E o2) {   
		    if (o1.compareTo(o2) > 0)
		      return o1;
		    else
		      return o2;
		  }
}
