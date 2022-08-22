package typevariable;

public class Bank {
	
	String bankName="ICIC BANK"; //static variable
	long accountNum1;// instance variable
	
   /* static account(long acc){
        accountNum=acc;
		return accountNum;
	}*/
	
	static {
		long mobileNo;//local variable     must be initialize
		//System.out.println(mobileNo);
	}
	
	static void Registration() {
		int registrationNo=9;//local variable
		System.out.println(registrationNo);
	}
	int otp() {
		int num= 123;//local variable
		return num;
	}
	
	void accvarrify() {
		System.out.println(bankName);
		//System.out.println(accountNum);
		System.out.println(accountNum1);
	}
	/*long accountNum(long acc) {
		
		this.accountNum=acc;
		return accountNum;
	}*/
	
	public static void main(String[] args) {
		long accountNum=99999999;  //local variable
		Bank b1=new Bank();
		//b1.accountNum(5678932);
		System.out.println(accountNum);
		b1.accvarrify();
	}

}
