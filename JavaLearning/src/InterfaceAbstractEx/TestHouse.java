package InterfaceAbstractEx;

public class TestHouse {

	public static void main(String[] args) {
		House h1 = new House(1,1000);
		House h2 = (House) h1.clone();
		
		java.util.Date d = (java.util.Date)h1.getWhenBuilt().clone();
		
		h2.setWhenBuilt(d);
		
		//h2.whenBuilt = (Date) h1.whenBuilt.clone();
		
System.out.println(h1.getId()+" Area: "+h1.getArea()+" Date: "+h1.getWhenBuilt());
System.out.println(h2.getId()+" Area: "+h2.getArea()+" Date: "+h2.getWhenBuilt());

Object o = new Object();


	}

}
