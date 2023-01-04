package ch04;

public class Ex9 {

	public static void main(String[] args) {
		//while 문을 이용해 1~10까지의 합
		
		int sum = 0;
		int i = 0;
		while(i < 11) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		while(true) {
			System.out.println("while문 실행");
			if(true) {
				break;// 반복문 빠져나감
			}
		}
		
		 
		
	}

}
