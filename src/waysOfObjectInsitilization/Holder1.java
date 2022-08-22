package waysOfObjectInsitilization;

public class Holder1 {
	public static void main(String[] args) {
		Bank1 b1=new Bank1();
		b1.accNo=287475;
		b1.holderName="Harry";
		
		System.out.println("Holder "+b1.holderName+" account number is "+b1.accNo);
	
	    Bank1 b2= new Bank1();
	    b2.accNo=3838949;
	    b2.holderName="Poter";
	    
	    System.out.println("Holder "+b2.holderName+" account number is "+b2.accNo);
	
	
	
	}

}
