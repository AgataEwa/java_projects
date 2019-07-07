import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		fizzBuzz();
		System.out.println("please give a sentence to encode");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println("your sentence is " + s);
		scan.close();
		Random rnd = new Random();
		int n = rnd.nextInt();
		n = java.lang.Math.abs(n);
		System.out.println("your number n is: " + n);
		String s1 = encode(s, n);
		System.out.println("the encoded sentence is: " +s1);
		String s2 = decode(s1, n);
		System.out.println("you decoded sentence is: " + s2);

	}

	// method encoding a given string using Ceaser cipher
	// each letter is replaced by another letter n letters down the English alphabet
	// method supports special symbols blank space ! ? . , ( ) :
	// method does not support capital letters
	static public String encode(String s, int n) {
		String alfabet = "abcdefghijklmnoprstuwxyz";
		int i = 0;
		int letter = 0;
		int exception = 0;
		String string = "";
		// special symbols
		String syst = " !?.,():";
		boolean sym = false;
		int symbol = 0;
		int q24 = n / 24;
		if (q24 >= 1) {
			n = n - q24 * 24;
		}
		while (i < s.length()) {
			letter = 0;
			symbol = 0;
			sym = false;
			while (symbol < syst.length()) {
				if (s.charAt(i) == syst.charAt(symbol)) {
					sym = true;
					break;
				}
				symbol++;
			}
			while (letter < alfabet.length()) {
				if (sym) {
					break;
				}
				;
				if (s.charAt(i) == alfabet.charAt(letter)) {
					break;
				}
				letter++;
			}
			if (sym) {
				string = string + s.charAt(i);
			} else if (letter + n >= alfabet.length()) {
				exception = (letter + n) - alfabet.length();
				string = string + alfabet.charAt(exception);
			} else {
				string = string + alfabet.charAt(letter + n);
			}
			i++;
		}
		return string;
	}

	
	// method decodes the string encoded by method encode
	static public String decode(String s, int n) {
		String alfabet = "abcdefghijklmnoprstuwxyz";
		int i = 0;
		int letter = 0;
		int a = 0;
		String string = "";
		// special symbols
		String syst = " !?.,():";
		boolean sym = false;
		int symbol = 0;
		int q24 = n / 24;
		if (q24 >= 1) {
			n = n - q24 * 24;
		}
		while (i < s.length()) {
			letter = 0;
			symbol = 0;
			sym = false;
			while (symbol < syst.length()) {
				if (s.charAt(i) == syst.charAt(symbol)) {
					sym = true;
					break;
				}
				symbol++;
			}
			while (letter <= alfabet.length()) {
				if (sym) {
					break;
				}
				;
				if (s.charAt(i) == alfabet.charAt(letter)) {
					break;
				}
				letter++;
			}
			if (sym) {
				string = string + s.charAt(i);
			} else if (letter - n < 0) {
				a = alfabet.length() + (letter - n);
				string = string + alfabet.charAt(a);
			} else {
				string = string + alfabet.charAt(letter - n);
			}
			i++;
		}
		return string;
	}
	
	// method prints out each number from to 1 to 100
	// instead of multiples of 3 Fizz is printed
	// instead of multiples of 5 Buzz is printed
	// instead of multiples of both 5 and 3 FizzBuzz is printed 
	static public void fizzBuzz() {
		int i = 1;
		while (i <= 100) {
			int q3 = i / 3;
			int q5 = i / 5;
			if (3 * q3 == i & 5 * q5 != i) {
				System.out.println("Fizz");
			} else if (5 * q5 == i & 3 * q3 != i) {
				System.out.println("Buzz");
			} else if (5 * q5 == i & 3 * q3 == i) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
			i++;
		}
	}

}
