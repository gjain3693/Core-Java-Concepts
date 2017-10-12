package oops;

public class Encapsulation {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data = new Data(18,"Honey");
		data.getAge();
		data.getName();
	}

}


class Data {
	
	private int age;
	private String name;
	
	public Data(int setAge, String setName) {
		age = setAge;
		name = setName;
	}
	
	public void getName() {
		System.out.println("NAME:::"+name);
			
	}
	
	public void getAge() {
		System.out.println("AGE:::"+age);
			
	}
	
}
