package ch06;

class SuperClass3{
	public SuperClass3() {
	System.out.println("Super 생성자");
	}
}

class SubClass3 extends SuperClass3{
	public SubClass3() {
		super(); // 생략됨:반드시 생성자의 첫라인에 와야함
		System.out.println("Sub 생성자");
	}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
//		SuperClass3 s1 = new SuperClass3();
		SubClass3 sub1 = new SubClass3();
	}

}
