package waysOfObjectInsitilization;

public class Bank2 {

	long accountNo;
	String holderName;
	
	void insertRecord(long acc, String name) {
		accountNo= acc;
		holderName=name;
	}
	
	void display() {
		System.out.println("Holder "+holderName+" account number is "+accountNo);
		
	}
}
