package ch06;

public class AccessEx2 {

	static class Access2{
		private int a = 0;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		private int age = 0;
	}
	
	
	public static void main(String[] args) {
		Access2 ac = new Access2();
		ac.a =10;
	}

}
