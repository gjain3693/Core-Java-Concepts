package other;

import javax.management.ImmutableDescriptor;

public class CallImmutable {

	public static void main(String args[]) {
		Immutable immutable = new Immutable(45,"Helen");
		immutable.getValues();
	}
	

}
