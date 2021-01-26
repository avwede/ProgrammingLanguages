import java.util.*;

public class Contest505 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int[] letterCounts = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int foundIt = 0;

		int numberOfPuppies = scan.nextInt();
		String puppyColors = scan.next();
		
		if (numberOfPuppies==1) {
			System.out.println("Yes");
			scan.close();
			return;
		}

		//System.out.println("Number:" + numberOfPuppies);
		//System.out.println("Puppy colors:" + puppyColors);

		char myLetter;
		char myColor;

		for (i = 0; i < 26; i++) {
			myLetter = alphabet[i];

			for (j = 0; j < numberOfPuppies; j++) {
				myColor = puppyColors.charAt(j);
				if (myLetter == myColor) {
					letterCounts[i]++;
					// System.out.println("FOUND IT: " + myColor + " INDEX: " + i + " Counter: " +
					// letterCounts[i]);
				}
			}
		}

		for (i = 0; i < 26; i++) {
			if (letterCounts[i] > 1) {
				foundIt = 1;
		}
		}
		if (foundIt == 1) {
				System.out.println("Yes");
		}
		else 
		{
				System.out.println("No");
		}
	
		scan.close();
	} }