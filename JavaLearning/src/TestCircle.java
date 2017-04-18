
public class TestCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle object1=new Circle(20, "hareesh");
		object1.name="k";
		args=new String[2];
		args[0]="ram";
		System.out.println("area1:"+object1.getArea());//314.
		//object1.radius=20;
		
		Circle object3=new Circle(5,"raj");
		
		Circle object2;
		object2=new Circle(4,"h");
		
		System.out.println("area2:"+object1.getArea());
		System.out.println("area3:"+object2.getArea());
		System.out.println("area4:"+object3.getArea());//
		
		System.out.println("a+b:"+object1.add(10, 20));
		
	System.out.println(args[0]);
		
	}
}
