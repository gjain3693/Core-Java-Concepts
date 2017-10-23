package arraystest;

public class ReverseString {
	
	
	static void reverse(String str) {
		
		int len = str.length();
		
		
		char ch[]=str.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			
		}
		
		
	}
	
	
	static StringBuffer reverseAgain(StringBuffer strBuff) {
		
		return strBuff.reverse();
		
	}
	
	static String reverseStringRecursive(String str) {
		if(str==null || str.length()<=1) {
			return str;
		} else {
			return reverseStringRecursive(str.substring(1))+str.charAt(0);
		}
		
	}
	
	public static void main(String[] args) {
		ReverseString.reverse("Gaurav");
		
		StringBuffer sb = new StringBuffer("Honey");
		
		sb = ReverseString.reverseAgain(sb);
		
		System.out.println("REVERSE::"+sb);
		
		String abc = ReverseString.reverseStringRecursive("MyJava");
		
		System.out.println("STRING:::"+abc);
	}
	

}
