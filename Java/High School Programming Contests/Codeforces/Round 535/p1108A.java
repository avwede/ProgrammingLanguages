import java.util.Scanner;

public class p1108A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int runs = scan.nextInt();

		for (int i = 0; i < runs; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			int c = scan.nextInt();
			int d = scan.nextInt();

			if (a == c) {
				a++;
			}

			System.out.println(a + " " + c);

		}
	}
}
