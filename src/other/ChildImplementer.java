package other;

class Implementers implements Mechenical {
	
	@Override
	public void startMotor() {
		System.out.println("METHOD IN PARENT");
	}

}


public class ChildImplementer extends Implementers {
	
	public static void main(String[] args) {
		Mechenical mechenical = new Implementers();
		mechenical.startMotor();
	}
	
}
