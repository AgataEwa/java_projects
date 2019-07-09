package hausaufgabe_jackblack;

public class Card {
	String cardName; 
	int value = 0;
	
	public Card(int i) {
		switch (i) {
		case 1:
			this.cardName = "ace";
			break;
		case 2:
			this.cardName = "two";
			break;
		case 3:
			this.cardName = "three";
			break;
		case 4: 
			this.cardName = "four";
			break;
		case 5:
			this.cardName = "five";
			break;
		case 6:
			this.cardName = "six";
			break;
		case 7:
			this.cardName = "seven";
			break;
		case 8:
			this.cardName = "eight";
			break;
		case 9:
			this.cardName = "nine";
			break;
		case 10:
			this.cardName = "ten";
			break;
		case 11:
			this.cardName = "jack";
			break;
		case 12:
			this.cardName = "queen";
			break;
		case 13:
			this.cardName = "king";
			break;
		default: 
			System.out.println("error");
		}		
	}
	
	public void assValue(int i) {
		this.value = i;
	}
}
