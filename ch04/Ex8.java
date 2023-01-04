package ch04;

public class Ex8 {

	public static void main(String[] args) {

		Ex7 e = new Ex7();
		e.b = 10;
		System.out.println(e.b);

		// 1번문제
		int sum = 0;
		for (int i = 1; i < 31; i++) {
			sum += i;
		}
		System.out.println("1부터30의 합은 " + sum);

		// 2번문제
		int a = 0; // 짝수의합
		int b = 0; // 홀수의합
		for (int i = 1; i < 31; i++) {
			if (i % 2 == 0) {
				a += i;
			} else {
				b += i;
			}
		}
		System.out.println("짝수의합은 " + a + " 홀수의 합은 " + b);

		// 3번문제 229까지 됨
		int c = 0;
		int d = 0;
		int toral = 0;
		for (int i = 1; i < 51; i++) {
			c = i % 10;
			d = i / 10;
			d = d % 10;
			if (d != 0 && d % 3 == 0) {
				System.out.println(i);
				toral += i;
			} else if (c != 0 && c % 3 == 0) {
				toral += i;
			}
		}

		System.out.println(toral);

	}

}
