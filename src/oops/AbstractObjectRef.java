package oops;


abstract class CallMe {
	
	static int x;
	public CallMe(int j) {
	x=j;
	}
	
	public void call() {
		
	}
	
}



public class AbstractObjectRef extends CallMe {

	
	public AbstractObjectRef(int t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractObjectRef abstractObjectRef = new AbstractObjectRef(9);
		System.out.println(AbstractObjectRef.x);
	}
	
	

}
