import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("what is your string?");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next(); 
		scanner.close();
		isPalindrome(string);
		
	}
	
	public static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		int j = (word.length() - 1);
		int i = 0;  
		while(i <= j ) {
			if (word.charAt(i) != word.charAt(j)) {
				System.out.println("your string is not a palindrome!");
				return false;
			}
			i++;
			j--;
		}
		System.out.println("your string is a palindrome!");
		return true; 
	}

}
