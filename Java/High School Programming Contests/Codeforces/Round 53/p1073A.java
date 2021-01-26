import java.util.Scanner;

public class p1073A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();

		if (str.length() == 1) {
			System.out.println("NO");
			return;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.charAt(0) != sub.charAt(1)) {
				System.out.println("YES");
				System.out.println(sub);
				return;
			}
		}
		System.out.println("NO");
	}
}
