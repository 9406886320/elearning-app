package wayToCreateObject;

public class ByClassNewInstanceMethod {

	String holderName="Juila";
	public static void main(String[] args) {
		
		try {
			ByClassNewInstanceMethod obj=ByClassNewInstanceMethod.class.newInstance();
			System.out.println(obj.holderName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
