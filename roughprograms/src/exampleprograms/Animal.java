package exampleprograms;

class Lion{
	public static void run() {
		System.out.println("Running");
	}
}
public class Animal extends Lion{
	public static void eat() 
	{
		System.out.println("Eating");	
	}
	public void hunt(){
		System.out.println("Hunting");
	}
	public static int time() 
	{
		int a=58;
		int b=90;
		int c=a+b;
		System.out.println("Breathing");
		System.out.println(c);
		return c ;
	}
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.hunt();
			run();
			eat();
			time();
	}
}
