package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요:");
		
		int a = sc.nextInt();
		System.out.println("입력한숫자:"+ a);
		
		if(a%3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의배수가 아닙니다.");
		}
	}

}
