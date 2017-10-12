package other;

 class InterfaceParent implements Shape  {
	
	@Override
	public void type() {
		System.out.println("=========CIRCLE=======");
	}
	
	public void parentMethod() {
		System.out.println("Parent Method");
	}
	
	
}


public class  InterfaceChild extends InterfaceParent {
	
	@Override
	public void type() {
		System.out.println("=======SQUARE======");
	}
	
	public void childMethod() {
		System.out.println("Child Method");
	}
	
	public static void main (String args[]) {
		Shape interfaceObject = new InterfaceChild();
		Shape interfaceObject2 = new InterfaceParent();
		interfaceObject.type();
		
		/* Method of child class not accessible via object reference
		 * of interface as method not available in interface
		 * interfaceObject.childMethod();
		 */
		
		interfaceObject2.type();
		
		/*Method of parent class not accessible via object refernce 
		 * of interface as method not available in interface
		 * interfaceObject2.parentMethod(); 
		 */
		
	}
	
	
	
}
