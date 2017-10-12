package other;

public final class Immutable {
	
	private final int age;
	private final String name;
	
	public Immutable(int age, String name) {
		
		this.age = age;
		this.name = name;
		
	}
	
	public void getValues() {
		System.out.println("AGE:::"+age);
		System.out.println("NAME:::"+ name);
	}

}


