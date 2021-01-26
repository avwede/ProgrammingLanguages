import java.util.Scanner;

public class flipper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int runs = scan.nextInt();

		scan.nextLine();

		for (int i = 1; i <= runs; i++) {

			String str = scan.nextLine();
			int lastNum = Integer.parseInt(str.charAt(str.length() - 1) + "");
			System.out.print("Input #" + i + ": ");

			if (lastNum == 8) {
				System.out.println(5);
			} else if (lastNum == 9) {
				System.out.println(4);
			} else if ((7 - lastNum) % 2 == 0) {
				System.out.println((7 - lastNum) / 2);
			} else {
				System.out.println(((7 - lastNum) / 2) + 1);
			}

		}

	}

}
