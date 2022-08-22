package typevariable;

public class AddingLowerType {
	
	void low() {
		byte a=10;
		byte b=20;
		//byte c=a+b;
		byte c=(byte)(a+b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		new AddingLowerType().low();
	}
}
