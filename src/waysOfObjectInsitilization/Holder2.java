package waysOfObjectInsitilization;

public class Holder2 {
	public static void main(String[] args) {
		Bank2 b1= new Bank2();
		b1.insertRecord(3456789,"Ravi");
		b1.display();
		Bank2 b2= new Bank2();
		b2.insertRecord(5677889,"Nick");
		b2.display();
		
	}

}
