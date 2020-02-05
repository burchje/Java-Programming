/******************


import java.util.Scanner;
public class PhoneSelection {
	public static void main(String[] args) {
		/******************
		*Create Scanner
		******************/
		Scanner input = new Scanner(System.in);
		
		/******************
		*Prompt user to enter a letter
		******************/
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
		char letter = input.next().charAt(0);
		
		/******************
		* Convert letter to upper case
		******************/
		letter = Character.toUpperCase(letter);
		
		/******************
		* Use switch function to print telephone output of letter
		******************/
		switch (letter){
			case 'A':
			case 'B':
			case 'C': System.out.println("The digit 2 corresponds to " + letter + " on the telephone."); break;
			case 'D':
			case 'E':
			case 'F': System.out.println("The digit 3 corresponds to " + letter + " on the telephone."); break;
			case 'G':
			case 'H':
			case 'I': System.out.println("The digit 4 corresponds to " + letter + " on the telephone."); break;
			case 'J':
			case 'K':
			case 'L': System.out.println("The digit 5 corresponds to " + letter + " on the telephone."); break;
			case 'M':
			case 'N':
			case 'O': System.out.println("The digit 6 corresponds to " + letter + " on the telephone."); break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S': System.out.println("The digit 7 corresponds to " + letter + " on the telephone."); break;
			case 'T':
			case 'U':
			case 'V': System.out.println("The digit 8 corresponds to " + letter + " on the telephone."); break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z': System.out.println("The digit 9 corresponds to " + letter + " on the telephone."); break;
			/************
			* Make sure ‘letter’ is a single letter and not a number or word
			************/
			default: System.out.println("Incorrect input");
		}
	}
}
			
			
		
	