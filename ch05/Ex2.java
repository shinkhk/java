package ch05;

public class Ex2 {

	public static void main(String[] args) {
		//n차 개수만큼 for문 존재	
		int arr[][] = new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
				System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
			}
		}
		
		int arr2[][] = {{1,2},
						{3,4,5},
						{6},
						{1,2,3,4},
						{2,3,4}};
		
		System.out.println(arr2.length);
		
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum = sum + arr2[i][j];
			}
		}
		System.out.println(sum);
		
		double arr3[][] = {{1.0},
	               {2.3,3.4},
	               {4.5,6.2,4.3},
	                {9.0}};
		double total = 0;
		double sum2 = 0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				sum2 = sum2 + arr3[i][j];
				total++;
			}
		}
		System.out.println(sum2 / total);
	}

}
