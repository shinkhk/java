package ch04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		for(int i=1; i < 21; i++) {
			int a = i%10;
			
			if(a == 0) {
				System.out.println(i);
			}else if(a%3 == 0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
		
	}

}
