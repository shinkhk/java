package ch04;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요:(0~100)");
		int a = sc.nextInt();
		System.out.println("학년을 입력하세요:(1~4)");
		int b = sc.nextInt();
		
		if(a>=60) {
			if(b == 4 && a >= 70) {System.out.println("합격입니다.");}
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}

}
