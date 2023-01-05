package ch06;

class Constructor2{
//	생성자가 하나라도 있으면 디폴프 생성자 제공 안함
	public Constructor2() {
		super();
	}
	
	public Constructor2(int a) {
		super();
	}
	
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		Constructor2 c1 = new Constructor2();
		Constructor2 c2 = new Constructor2(11);
		
		//Dialig 생성자는 디폴트 생성자 존제안함
		//Dialog d = new Dialog();
	}

}
