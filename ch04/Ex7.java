package ch04;

public class Ex7 {
	
	int b;

	public static void main(String[] args) {
		//for 문을 이용해 1~10까지의 합
		int total = 0;
		for(int i = 1; i < 11; i++) {
			total += i;
		}
		System.out.println("sum:"+total);
		int j = 0;
		for(; j < 11;j++) {}
		System.out.println(j);
	}

}
