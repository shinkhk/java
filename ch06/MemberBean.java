package ch06;

public class MemberBean {
	
	private String id;
	private int age;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
//		여기서 this 는 인스턴스 변수(필드)를 지정 자신의 객체 주소값 or 자신객체
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
	
	}

}
