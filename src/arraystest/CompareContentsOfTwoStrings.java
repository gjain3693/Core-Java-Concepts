package arraystest;

import java.util.Arrays;

public class CompareContentsOfTwoStrings {
	
	
	static Boolean result(String[] c,String[] d) {
		
	//	for(int i=0;i<c.length;i++) {
		boolean b=	Arrays.equals(c, d);
				return b;
		//	}
		//}
		//return false;
		
	}
	
	static Boolean equalArray(String str[],String atr[]) {
		
		Arrays.sort(str);
		Arrays.sort(atr);
		
		Boolean b = Arrays.equals(str, atr);
		
		return b;
		
	}
	
	public static void main(String[] args) {
		String c[]={"a"," ","b"};
		String d[]={"a","b","a"};
		Boolean z = CompareContentsOfTwoStrings.result(c, d);
		
		System.out.println("RESULT::"+z);
		
		String input[]={"Test","Test","REST"};
		String in[]={"Test","Test","REST"};
		
		Boolean result = CompareContentsOfTwoStrings.equalArray(input,in);
		
		System.out.println("RESULT:::"+result);
	}

}
