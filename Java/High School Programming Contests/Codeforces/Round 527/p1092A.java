import java.util.Scanner;

public class p1092A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int runs = scan.nextInt();

		for (int j = 0; j < runs; j++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			for (int i = 0; i < a; i++) {

				System.out.print((char) ('a' + i % b));

			}
			
			System.out.println();
		}

	}
}
