import java.util.Scanner;

public class p1077A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int runs = scan.nextInt();

		for (int i = 0; i < runs; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long k = scan.nextLong();

			long round1 = (k/2)* b;
			long round2 = (k - (k/2)) * a;
		
			
			System.out.println((0 - round1) + round2);

		}

	}
}
