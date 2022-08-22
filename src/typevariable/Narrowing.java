package typevariable;

public class Narrowing {
	
	void typecasting() {
		
	float f=10.5f;
	//int a=f; C.E
	int a=(int)f; //typecasting
	System.out.println(f);
	System.out.println(a);
	}
	public static void main(String[] args) {
		new Narrowing().typecasting();
	}
	
	
	
}
