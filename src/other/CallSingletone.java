package other;

// Lazy Instantiation

class Singletone {
	
	private static Singletone singletone = null;
	
	public String str;
	
	private Singletone() {
		str = "Here is the code which is used by singletone object";
	
	}
	
	public static Singletone getSingletoneValue() {
		if(singletone == null) {
			singletone = new Singletone();
		}
		return singletone;
	}

}



public class CallSingletone {
	
	public static void main(String[] args) {
		Singletone refOne = Singletone.getSingletoneValue();
		System.out.println("Value with 1st refernce :::" + refOne.str);
		
		Singletone refTwo = Singletone.getSingletoneValue();
		System.out.println("Value with 2nd refernce :::" + refTwo.str);
		
		refTwo.str = (refTwo.str).toUpperCase();
		System.out.println("Change value with 2nd refernce :::" + refTwo.str);
		
		Singletone refThree = Singletone.getSingletoneValue();
		System.out.println("Value with 3rd refernce :::" + refThree.str);
	}
	
	
}
