package ch06;

//class선언
class Car1 {
	
	//필드:객체의 속성	-> 무조건 괄호() 가 없다
	String carName;
	String carColor;
	int velocity;
	
	//메서드:객체의 기능 -> 반드시 괄호() 가 있다
	void speedUp() {
		velocity++;
	}
	
	void sppedDown() {
		velocity--;
		if(velocity < 0)
			velocity = 0;
	}
	
	void stop() {
		velocity = 0;
	}
	
	
	//
	
}


//java로 선언된 클래스만 public 사용가능!!
public class CarEx1 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);
		String str = "오늘의 메뉴는 컵밥";
		System.out.println(str.length());
		
		Car1 c1 = new Car1();
		c1.carName ="소나타";
		c1.carColor = "은색";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}

}
