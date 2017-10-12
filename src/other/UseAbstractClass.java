package other;

public class UseAbstractClass extends CallAbstract {
	
	@Override
	public void nonAbstractMethod () {
		
		System.out.println("nonAbstarctMethodOfAbstarctClass");
		
	}
	
	@Override
	public void abstractMethod() {
		System.out.println("AbstarctMethodOfAbstarctClass");
	}
	
	public void ownMethod() {
		System.out.println("OWN method");
	}
	
	public static void main (String args[]) {
		UseAbstractClass useAbstractClass = new UseAbstractClass ();
		
		useAbstractClass.abstractMethod();
		useAbstractClass.nonAbstractMethod();
		useAbstractClass.ownMethod();
		
	}
	
	

}


abstract class  CallAbstract {
	
	public void nonAbstractMethod() {
		System.out.println("This is a NON ABSTRACT METHOD");
	}
	
	public abstract void abstractMethod();
	
}
