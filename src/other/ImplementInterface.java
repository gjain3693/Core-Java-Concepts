package other;

public class ImplementInterface implements Shape {

	@Override
	public void type() {
		System.out.println("RECTANGLE");
	}
	
	public static void main(String[] args) {
	
		Shape interfaceObject = new ImplementInterface();
		interfaceObject.type();
	
	
	}

}
