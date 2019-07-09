package hausaufgabe_jackblack;

import java.util.Random;
import java.util.Scanner;

public class jackBlack {

	public static Card getRandomCard() {
		Random rand = new Random();
		int i = rand.nextInt(13);
		i++;
		Card card = new Card(i);
		return card;
	}

	public static void play() {
		Computer c = new Computer();
		You y = new You();
		int you, comp;
		you = comp = 1;
		System.out.println("let the game begin!");
		Card card1 = getRandomCard();
		Card card2 = getRandomCard();
		c.addCard(card1);
		c.addCard(card2);
		System.out.println("computer got " + card1.cardName + " and " + card2.cardName + " his value is " + c.handValue());
		Card card3 = getRandomCard();
		Card card4 = getRandomCard();
		y.addCard(card3);
		y.addCard(card4);
		System.out.println("you got " + card3.cardName + " and " + card4.cardName + " your score is " + y.handValue());
		Scanner scanner = new Scanner(System.in);
		String answer;
		while (you == 1 || comp == 1) {
			while (you == 1) {
				System.out.println("get new card or done?");
				answer = scanner.nextLine();
				if (answer.equals("get new card")) {
					Card cardU = getRandomCard();
					y.addCard(cardU);
					System.out.println("you got " 
					+ cardU.cardName + " your score is " + y.handValue());
					break;
				} else if (answer.equals("done")) {
					you = 0;
				} else {
					System.out.println("please enter valid answer");
				}
			}
			if (c.handValue() < 17) {
				Card cardComp = getRandomCard();
				c.addCard(cardComp);
				//System.out.println("computer got " + cardComp.cardName + " his value is " + c.handValue());
			} else {
				comp = 0;
			}
		}
		scanner.close();

		if (c.handValue() > 21 & y.handValue() <= 21) {
			System.out.println("you won!");
			System.out.println("your hand value was " + y.handValue() + " computers hand value was " + c.handValue());
			return;
		} else if (c.handValue() == y.handValue() & y.handValue() < 22) {
			System.out.println("there is a draw!");
			System.out.println("your hand value was " + y.handValue() + " computers hand value was " + c.handValue());
			return;
		} else if (y.handValue() <= 21 & y.handValue() > c.handValue()) {
			System.out.println("you won!");
			System.out.println("your hand value was " + y.handValue() + " computers hand value was " + c.handValue());
			return;
		} else {
			System.out.println("you lost!");
			System.out.println("your hand value was " + y.handValue() + " computers hand value was " + c.handValue());
			return;
		}

	}

}
