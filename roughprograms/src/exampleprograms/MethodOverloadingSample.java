package exampleprograms;
public class MethodOverloadingSample {
	public int sum(int a, int b) {
		return (a+b);
	}
    public double sum(double d, double e, double f) {
	return(d+e+f);
}
public static void main(String[] args) {
	MethodOverloadingSample m=new MethodOverloadingSample();
	System.out.println(m.sum(10, 20));
	System.out.println(m.sum(5.9, 9.4, 2.6));
}
}
