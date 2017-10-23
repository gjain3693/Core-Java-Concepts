package arraystest;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsOfArrays {

	
	public static void common(String []a,String[]b) {
		
		Set com = new HashSet<String>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i].equals(b[i])) {
					com.add(a[i]);			
				}
			}
		}
		
		System.out.println("Elements:::"+com);
		
		
	}
	public static void main(String[] args) {
		String d[]={"set","bet","rat"};
		String e[]={"test","bat","rat"};
		CommonElementsOfArrays.common(d, e);

	}

}
