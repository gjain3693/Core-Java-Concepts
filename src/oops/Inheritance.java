package oops;

public class Inheritance extends Parent {

	public Inheritance(String mod, int cos) {
		
		super (mod,cos);
		
	}
	public static void main(String[] args) {
	
		Inheritance inheritance = new Inheritance("IOS",45000);
		inheritance.getValues();
	}

}


 class Parent {
	
  private String model;
  private int cost;
  
  Parent(String model, int cost) {
	  this.model = model;
	  this.cost = cost;
  }
  
  public void getValues() {
	  System.out.println("MODEL:::"+model);
	  System.out.println("cost:::"+cost);
  }
	
}
