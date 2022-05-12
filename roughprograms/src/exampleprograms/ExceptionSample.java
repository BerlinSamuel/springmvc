package exampleprograms;

public class ExceptionSample {
	public static void main(String[] args) {
		try {
			int i=100/0;
		}catch(Exception e) {
			System.out.println(e);
			}
			System.out.println("Rest of the code");		
	}

}
