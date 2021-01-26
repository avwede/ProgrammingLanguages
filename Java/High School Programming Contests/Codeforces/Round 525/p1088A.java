import java.util.Scanner;

public class p1088A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int a = 1; a <= n; a++) {

			for (int b = 1; b <= n; b++) {

				if (a % b == 0 && (a / b < n) && a * b > n) {

					System.out.print(a + " ");
					System.out.println(b);
					return;

				}

			}

		}
		System.out.println(-1);
	}
}
