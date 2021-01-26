import java.util.Scanner;

public class p1065A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int runs = scan.nextInt();

		while (runs-- > 0) {

			int money = scan.nextInt();
			int specialOffer = scan.nextInt();
			int freeBars = scan.nextInt();
			int cost = scan.nextInt();

			System.out.println(money / cost / specialOffer * (long) freeBars + money / cost);

		}
	}
}
