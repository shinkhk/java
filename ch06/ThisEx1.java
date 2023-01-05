package ch06;

class This1{
	public This1(This2 t2) {
		
	}
}

class This2{	
	public This2() {
		This1 t1 = new This1(this); // 여기서 this는 자신 객체의 주소값
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		This2 t2 = new This2();
	}

}
