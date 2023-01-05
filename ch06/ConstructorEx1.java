package ch06;


class Constructor1{
	//생성자 정의
	public Constructor1() {
		//기능이 없음 -> 기본생성자:컴파일 시점에 JVM이 제공해줌
	}
}

public class ConstructorEx1 {
	class Contru1{
		//생성자 정의
		public Contru1() {
			//기능이 없음 -> 기본생성자:컴파일 시점에 JVM이 제공해줌
		}
	}
	public static void main(String[] args) {
		 Constructor1 c1 = new Constructor1();
		 String s = new String();
	}

}
