package ch06;

class Constructor5{
	
	int a;
	String str;
	
	public Constructor5() {
//	중복기능
	}
	public Constructor5(int i) {
//  중복기능
		a = i;
	}
	public Constructor5(String s) {
//	중복기능	
		str = s;
	}
	
}

class Constructor5_1{
	int a;
	String str;
	public Constructor5_1() {
		
	}
	public Constructor5_1(int i) {
		//자신의 디폴트 생성자를 호출하고 생산자의 첫라인!
		//즉 super 와 같이 사용 불가함
		this();
		a = i;
	}
	public Constructor5_1(String s) {
		this();
		str = s;
	}
}

public class ConstructorEx5 {

	public static void main(String[] args) {
		
	}

}
