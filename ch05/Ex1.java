package ch05;

public class Ex1 {

	public static void main(String[] args) {

		int arr[];

		arr = new int[5]; // 한번만들어지면 불변

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		int arr1[] = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = i * 10;
			System.out.println(arr[i]);
		}
		
		
		int arr2[] = {1,2,3,4,5,6};
		String str[] = {"Java", "JSP", "Android", "Spring"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
