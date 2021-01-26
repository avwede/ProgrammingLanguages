import java.util.Arrays;
import java.util.Scanner;

public class p1108B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int runs = scan.nextInt();

		int[] arr = new int[runs];
		boolean[] arr2 = new boolean[10001];

		for (int i = 0; i < runs; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);

		int firstNum = arr[runs - 1];
		int secondNum = 0;

		for (int i = 0; i < runs; i++) {
			if (firstNum % arr[i] == 0 && !arr2[arr[i]]) {
				arr2[arr[i]] = true;

			} else {
				secondNum = arr[i];
			}

		}
		System.out.println(firstNum + " " + secondNum);

	}
}
