package other;

public class UseInterface implements Mobile {

	@Override
	public void dialing() {
		System.out.println("Method of Interface");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseInterface useInterface = new UseInterface();
		useInterface.dialing();

	}


}


