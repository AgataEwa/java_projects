package hausaufgabe_jackblack;

public class Main {

	public static void main(String[] args) {
		// the excise was to program a simple card game Black Jack
		// rules: you play against the computer
		// to win, your cards need to have value closer to 21 than the computers, yet no
		// higher than 21
		// if your cards value is over 21, you lose regardless whether computers cards
		// are over 21 or not
		// each number card has the value of its number, each figure card has a value of
		// 10
		// value of a ace is either 1 or 11 depending on your choice
		// at the beginng of the game you and computer get two cards
		// later on you can choose whether you want to take another card or not
		// type 'get another card' or 'done' to choose
		// the game ends when both you and computer stop drawing cards
		// computer stop taking new cards once he's hand value reaches 17
		//
		// Good luck!

		jackBlack.play();
	}

}
