package hausaufgabe_jackblack;

import java.util.Scanner;

public class You extends Computer {

	public int getValueofCard(Card card) {
		switch (card.cardName) {
		case "ace":
			while (true) {
				System.out.println("choose a value for your ace: 1 or 11?");
				Scanner ans = new Scanner(System.in);
				String a = ans.nextLine();
				if (a.equals("1")) {
					return 1;
				} else if (a.equals("11")) {
					return 11;
				} else {
					System.out.println("error");
				}
			}
		case "two":
			return 2;
		case "three":
			return 3;
		case "four":
			return 4;
		case "five":
			return 5;
		case "six":
			return 6;
		case "seven":
			return 7;
		case "eight":
			return 8;
		case "nine":
			return 9;
		case "ten":
		case "jack":
		case "queen":
		case "king":
			return 10;
		default:
			System.out.println("error");
			return 0;
		}
	}
}
