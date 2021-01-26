import java.util.Scanner;

public class pizza {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int m = sc.nextInt();
			int numOfPizza = 0;
			for(int j = 0; j < m; j++) {
				numOfPizza += sc.nextInt();
				numOfPizza -= sc.nextInt();
				if(numOfPizza < 0) {
					numOfPizza = 0;
				}
			}
			System.out.println("Neighborhood #" + i + ": " + numOfPizza);
		}
	}

}
