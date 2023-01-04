package ch04;

public class Ex11 {

	public static void main(String[] args) {
		for(int i = 0; i < 11; i++) {
			if(i%2 == 0) {
			System.out.println(i);
			}
		}
		System.out.println("\n-----------------------------------------");
		
		for(int i = 0; i < 11; i++) {
			if(i%2 != 0) {
				continue;//여기서 for문으로 직행함 밑에 코드가 실행 안됨
			}
			System.out.println(i+ "\t");
		}
		System.out.println("\n-----------------------------------------");
		//1~20사이에 3의배수의 식과 값을 출력하시오 coutinue 사용
		int sum = 0;
		for(int i = 0; i < 21; i++) {
			if(i%3 != 0) {
				continue;
			}
			if(i == 18) {
				System.out.print(i+"=");
			}else {System.out.print(i+"+");}
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
