package hausaufgabe_jackblack;

import java.util.LinkedList;

public class Computer {
	
	LinkedList<Card> cards = new LinkedList<Card>();
	
	public void addCard(Card c) { 
		c.assValue(this.getValueofCard(c));
		cards.add(c);
	}
	
	public int handValue() {
		int i = 0;
		for(Card c : cards ) {
			i = i + c.value;
		}
		return i; 
	}
	
	public int getValueofCard(Card card) {
		switch (card.cardName) {
		case "ace":
			if (handValue() > 17) {
				return 1;
			} else {
				return 11;
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
