import java.util.Scanner;

public class p1055A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int metro = scan.nextInt();
		int home = scan.nextInt();

		int[] stationsOut = new int[metro];
		int[] stationsIn = new int[metro];

		for (int i = 0; i < stationsOut.length; i++) {
			stationsOut[i] = scan.nextInt();
		}

		for (int i = 0; i < stationsIn.length; i++) {
			stationsIn[i] = scan.nextInt();
		}

		if (stationsOut[0] == 0) {
			System.out.println("NO");
			return;
		} else if (stationsOut[home - 1] == 1) {
			System.out.println("YES");
			return;
		} else if (stationsIn[home - 1] == 0) {
			System.out.println("NO");
			return;
		}

		for (int i = home; i < metro; i++) {
			if (stationsOut[i] == 1 && stationsIn[i] == 1) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
