package other;

public class UseOfVariablesOfAbstractClass extends HavingVariables {
	
	@Override
	public void readValues() {
		
	}
	
	@Override
	public void abstractMethod() {
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HavingVariables  havingVariables = new UseOfVariablesOfAbstractClass();
		havingVariables.abstractMethod();
		havingVariables.readValues();
		System.out.println("AGE with Abstarct method reference"+"    "+havingVariables.age);
		System.out.println("Name with Abstarct method reference"+"   "+havingVariables.name);
		

	}

}


abstract class HavingVariables {
	
	int age = 10;
	String name = "Honey";
	
	public void readValues() {
		System.out.println("FROM METHOD AGE:::"+age);
		System.out.println("FROM METHOD NAME:::"+ name);
	}
	
	public abstract void abstractMethod();
}
