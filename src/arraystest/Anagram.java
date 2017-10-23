package arraystest;

import java.util.Arrays;

public class Anagram {
	
	public static void anagram(String atr,String str) {
		if(atr.length()==str.length()) {
			
			char[] a = atr.toLowerCase().toCharArray();
			char[] b = str.toLowerCase().toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			Boolean x = Arrays.equals(a, b);
			
			System.out.println("ANAGRAM::::" + x);
			
		}
	}
	
	public static void main(String[] args) {
		
		Anagram.anagram("Teaching", "Cheating");
		
	}

}
