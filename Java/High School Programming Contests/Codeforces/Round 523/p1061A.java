import java.util.Scanner;

public class p1061A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int coinValue = scan.nextInt();
		int sum = scan.nextInt();

		int newValue = 0;
		int count = 0;

		while (newValue < sum) {
			newValue += coinValue;
			count++;
		}
		
		System.out.println(count);
	}
}
