package ch04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Random;








public class LottoLucky {

	public static void main(String[] args) {
		int lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

	public static int[] getLotto() {
		int lotto[] = new int[6];
		// 배열밑 for문
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;// 1*45

			if (i > 0) {
				for (int j = 0; j < i; j++) {
					for (;true;) {
						if (lotto[i] == lotto[j]) {
							lotto[i] = (int) (Math.random() * 45) + 1;
							System.out.println("중복된 숫자:"+lotto[i]+" 교체된 숫자:"+lotto[j]); //확인용
						} else {break;}
					}
				}
			}

		}
		Arrays.sort(lotto);
		return lotto;
	}
}
