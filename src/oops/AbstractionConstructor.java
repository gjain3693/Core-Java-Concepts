package oops;


abstract class ContainsConstructor {
	
	abstract public void method1();
	private int age;
	int number = 9;
	
	public ContainsConstructor(int age) {
		this.age = age;
	}
	
	public void getAbstractValues() {
		System.out.println("AGE:::"+ age);
	}
}

public class AbstractionConstructor extends ContainsConstructor{

	public AbstractionConstructor(int age) {
		super(age);
		
	}
	@Override
	public void method1() {
		
	}
	public static void main(String[] args) {
		
		AbstractionConstructor abstractionConstructor = new AbstractionConstructor(27);
		abstractionConstructor.getAbstractValues();
		
		ContainsConstructor containsConstructor = new AbstractionConstructor(45);
		containsConstructor.getAbstractValues();
		int num = containsConstructor.number;
		

	}

}
