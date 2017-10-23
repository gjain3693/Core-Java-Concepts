package arraystest;

public class DuplicateElements {
	
	public static void main(String[] args) {
	String str[]={"xyz","abc","xyz"};
	for(int i=0;i<str.length-1;i++) {
		for(int j=1;j<str.length;j++) {
			if(str[i].equals(str[j]) && (i!=j)) {
				System.out.println("DUPLICATE:::"+str[j]);
			}
		}
	}
	}

}
