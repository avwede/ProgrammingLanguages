import java.util.Scanner;

public class p1118A {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int runs = scan.nextInt();
		
		for (int i = 0; i < runs; i++) {
			long n = scan.nextLong();
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			long minMoney = 0;
			
			if (b < 2 * a) {
				minMoney = ((n / 2 * b) + (n % 2 * a));
			} else {
				minMoney = n * a;
			}
			
			System.out.println(minMoney);
			
			
		}
		
		
		
		
		
		
		
		
	}
}
