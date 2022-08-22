package typevariable;

public class VariableOverflow {

	void overflow() {
		int a=130;
		byte b1=(byte)a;
		long accnum=3456789;
		//int an=(int)accnum;
		//float f=(float)accnum;
		byte b=(byte)accnum;
		System.out.println(accnum);
		//System.out.println(an);
		//System.out.println(f);
		System.out.println(b);
		System.out.println(b1);
	}
	
	public static void main(String[] args) {
		new VariableOverflow().overflow();
	}
}
