package src;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public static final void main(String[] args) {
		System.out.println("Hey there CIS350.");
	}
	
	public int roundUp(double a) {
		return (int) Math.ceil(a);
	}
	
	public int mod(int a, int b) {
		return a % b;
	}
	
}

