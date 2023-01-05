package ch06;

class Method2{
//	동일한 메서드 오버로딩(overloading) - 기능은 동일
//	동일한 메서드 명으로 매개변수의 계수는 다르게 선언
	
	void prn(int a) {
		System.out.println(a);
		return;
	}
	
	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	
	void prn(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}

	void prn(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
	}
}

public class MethodEx2 {

	public static void main(String[] args) {
		int a = Math.abs(-10);
		double d = Math.abs(3.14);
		
		Method2 nt = new Method2();
		nt.prn(10);
		nt.prn(10,20);
		nt.prn(10,20,30);
	}

}
