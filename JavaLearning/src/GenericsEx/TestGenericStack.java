package GenericsEx;

public class TestGenericStack {
public static void main(String[] args){
	
	
	GenericStack<Integer> gs= new GenericStack<Integer>();
	
	//gs.list.add(1);
	
	gs.push(1);
	gs.push(10);
	gs.push(100);
	
	GenericStack<String> gs2= new GenericStack<String>();
	
	gs2.push("hi");
	gs2.push("hello");
	
	System.out.println(gs2.peek());
}
}
