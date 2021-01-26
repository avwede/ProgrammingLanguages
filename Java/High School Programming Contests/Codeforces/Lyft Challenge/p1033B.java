import java.util.*;

public class p1033B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runs = scan.nextInt();
		long isPrime = -1;
		long alice;
		long bob;
		long area;

		for (int i = 0; i < runs; i++) {
			isPrime = -1;
			alice = scan.nextLong();
			bob = scan.nextLong();
			area = ((alice * alice) - (bob * bob));

			for  (long j = 2; j < (area / 2); j++) {

				if (area % j == 0) {
					isPrime = 0;
					break;
				}
			}
			if (isPrime == -1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}