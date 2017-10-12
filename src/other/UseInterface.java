package other;

public class UseInterface implements Mobile {

	@Override
	public void dialing() {
		System.out.println("Method of Interface");
	}
	
	public void extraMethod() {
		System.out.println("Method Implementer");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseInterface useInterface = new UseInterface();
		Mobile mobile = new UseInterface();
		mobile.dialing();
		
		useInterface.dialing();

	}


}


