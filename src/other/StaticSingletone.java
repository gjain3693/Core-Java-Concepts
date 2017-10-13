package other;


class StaticBlock {
	
	private static StaticBlock staticBlock;
	
	public String str;
	
	private StaticBlock() {
	str= "I am value which will be singletone";
	}
	
	static
	{
		try {
		staticBlock = new StaticBlock();
		} catch (Exception ex) {
			
		}
	}
	
	public static StaticBlock getInstance() {
		return staticBlock;
	}
	
}
public class StaticSingletone {

	public static void main(String[] args) {
	
		StaticBlock refOne = StaticBlock.getInstance();
		System.out.println("FIRST REFERENCE VALUE::" + refOne.str);
		
		StaticBlock refTwo = StaticBlock.getInstance();
		System.out.println("Second REFERENCE VALUE::" + refTwo.str);
		
		refTwo.str = refTwo.str.toUpperCase();
		System.out.println("Second REFERENCE VALUE change ::" + refTwo.str);
		
		StaticBlock refThree = StaticBlock.getInstance();
		System.out.println("Third REFERENCE VALUE::" + refThree.str);


	}

}
