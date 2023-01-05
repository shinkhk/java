package ch06;

class Method1 {

	int abs(int num) {
		if (num < 0)
			num = -num;
		return num;
	}

	void prn(int a, int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
}

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 n = new Method1();
		int a = n.abs(-10); 
		//return 형이 있는 메서드라도 값을 반드시받을필요는 없다
		System.out.println(a);
		n.prn(10, 20);
	}

}
