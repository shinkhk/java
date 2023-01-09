package ch06;

//static 필드,메소드,클래스(부분)
//static 필드 및 메소드는 객체를 생성하지 않아도 사용가능
//사용시점:클래스 이름으로 접금하기 때문에 그때 메모리에 로딩

class Static1{
	static int i = 0;
	int j = 0;
	
	static void prn1() {
		
	}
	void prn2() {
		
	}
	
	static class inner{ //내부클래스 에는 사용가능 하지만 잘 사용안함
		
	};
}

public class StaticEx1 {

	public static void main(String[] args) {
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		Integer i = new Integer(22);
		int c = i.parseInt("23");
		//parseInt 는 static으로 선언되어 사용할때 new를 쓸필요 없이 그냥 쓰면됨
		int d = Integer.parseInt("13");
		
		//반지름이 5인 원의 넓이를 구하시오
		System.out.println(5*5*Math.PI);
		System.out.println(d);
	}

}
