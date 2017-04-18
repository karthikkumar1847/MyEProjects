
public class Circle extends Object{
private int radius ;
public  String name;

public Circle(){
	
}
public Circle(int r,String n){
	radius=r;
	name=n;
	System.out.println("Radius:"+r);
}
public double getArea(){
	
	return Math.PI*radius*radius;

}
	public static int add(int a, int b){
		return a+b;
	}
	

	public int getRadius(){
		
		return radius;
	}


}
