package ch04;

public class Ex10 {

	public static void main(String[] args) {
		int a = 0;
		while(true) {
			if(a == 10) break;
			System.out.println("a:"+ a);
			a++;
		}
		
		//for문 이용 순차적으로 1에서 n까지의 합이 100에서 최대한가까운 합을 리턴하시오
		int sum = 0;
		for(int i = 0; true; i++) {
			if(sum > 100) break;
			System.out.print(i+"\t");
			sum+=i;
		}
		System.out.println(sum);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(i+"+"+j+"="+(i+j));
			}
			System.out.println();
		}
		
		iot://구역의 시작위치
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				if(i+j > 10)break iot;		//2번째 for문을 빠져나옴 라벨값(iot)가 있으면 다 빠져나옴
			}
		}
		
		
		//2중 중첩 for문 이용 i와j의 합이 30이 넘으면 빠져나오시오
		iot2:
		for(int i = 0;true; i++) {
			for (int j = 0;true; j++) {
				if(i+j > 30) break iot2;
			}
		}
		
	}

}
