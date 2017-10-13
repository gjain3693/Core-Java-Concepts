package other;


final class ImmutableCallable {
	
	private int number;
	private String name;
	
	public ImmutableCallable(int number, String name) {
		
		this.number = number;
		this.name = name;
		
	}
	
	
	public void getValues() {
		System.out.println("Number::"+number);
		System.out.println("Name::"+name);
	}
	
}

/*
 * Immutable class can't be protected/Private 
 */

final protected class ImmutableCall {
	
	private int age;
	private String add;
	
	public ImmutableCall(int age, String add) {
		
		this.age = age;
		this.add = add;
	
	}
	
	public void getVal() {
		
		System.out.println("age::"+age);
		System.out.println("add::"+add);
		
	}
	
}


public class AccessModifierOnImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImmutableCallable immutableCallable = new ImmutableCallable(27027, "Honey");
		immutableCallable.getValues();

	}

}
