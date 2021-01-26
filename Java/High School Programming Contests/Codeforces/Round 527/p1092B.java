import java.util.Arrays;
import java.util.Scanner;

public class p1092B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ppl = scan.nextInt();
		int[] arr = new int[ppl];
		int count = 0;

		for (int i = 0; i < ppl; i++) {

			arr[i] = scan.nextInt();

		}

		Arrays.sort(arr);

		for (int i = 0; i < ppl; i += 2) {

			count += arr[i + 1] - arr[i];

		}
		System.out.println(count);
	}
}
