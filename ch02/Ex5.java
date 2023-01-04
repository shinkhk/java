package ch02;

public class Ex5 {

	public static void main(String[] args) {
		int a = 10;
		long b = a;
		
		short c = (short)a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a = 32788;
		c = (short)a;
		
		System.out.println(c);
	}

}
