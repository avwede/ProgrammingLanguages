import java.util.Scanner;

public class pJDELAY {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runs = scan.nextInt();
		int count = 0;

		for (int j = 0; j < runs; j++) {
			int testCases = scan.nextInt();

			for (int i = 0; i < testCases; i++) {
				int firstInt = scan.nextInt();
				int secondInt = scan.nextInt();

				
				if ((secondInt - firstInt) > 5) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
