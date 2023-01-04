package ch04;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단");

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) / 10 > 0) {
					System.out.print(i + "*" + j + "=" + (i * j) + "  ");
				} else {
					System.out.print(i + "*" + j + "=" + (i * j) + "   ");
				}

				if (j == 9) {
					System.out.println();
				}
			}
		}
	}

}
