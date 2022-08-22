package typevariable;

public class VariableWidening {
	
	void widening() {
		int a=10;
		float f=a;
		System.out.println(a);
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		new VariableWidening().widening();
	}

}
