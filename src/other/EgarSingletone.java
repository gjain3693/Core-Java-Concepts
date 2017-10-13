package other;


class Egar {
	
	private static Egar egar = new Egar();
	
	public String str;
	
	private Egar() {
		str = "Here is the code which is used by singletone object";
	}
	
	public static Egar getInstance() {
		return egar;
	}
}

public class EgarSingletone {

	public static void main(String[] args) {
		
		Egar refOne = Egar.getInstance();
		System.out.println("Value from first reference:::"+refOne.str);
		
		Egar refTwo = Egar.getInstance();
		System.out.println("Value from second reference:::"+refTwo.str);
		
		refTwo.str = refTwo.str.toUpperCase();
		System.out.println("change Value from second reference:::"+refTwo.str);
		
		Egar refThree = Egar.getInstance();
		System.out.println("Value from second reference:::"+refThree.str);
		

	}

}
