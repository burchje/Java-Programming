/**********************************************
PalindromeCheck
This program prompts the user to input a 4-digit number and will tell you if that number is a palindrome.
The user also has the option to have the program generate a random number and will determine if that number is a palindrome.
Elijah Burch
1/30/2020
CMNC 255 003
***********************************************/

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		/**************
		* Create Scanner
		**************/
		Scanner input = new Scanner(System.in);
		/**************
		* Prompt user to make a choice
		**************/
		System.out.println("Enter 0 if you would like to enter a 4-digit number. Enter 1 if you would like to have the computer generate it.");
		/**************
		* Initialize all needed variables
		**************/
		int option = input.nextInt();
		int number;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		/**************
		* Give option to generate number or allow user to choose one
		**************/
		if (option == 0){ 
			System.out.println("Enter the 4-digit number:");
			number = input.nextInt();
			/**************
			* Use division and remainder to separate number into each digit
			**************/
			firstDigit = number/1000;
			secondDigit = number/100;
			secondDigit %= 10;
			thirdDigit = number/10;
			thirdDigit %= 10;
			fourthDigit = number%10;
			/**************
			* If number is not 4-digits, firstDigit will be 0
			**************/
			if (firstDigit==0 || firstDigit >=10){
				System.out.println("Incorrect input");
			}else{
				/**************
				* If firstDigit is equal to fourthDigit and secondDigit is equal to thirdDigit, number is a palindrome
				**************/
				if (firstDigit == fourthDigit && secondDigit == thirdDigit)
					System.out.println(number + " is a palindrome");
					/***************
					* If not, print number is not a palindrome
					***************/
				else 
					System.out.println(number + " is not a palindrome");
			}
		
		}else if (option == 1){ 
			/**************
			* Generate a random number with Math.random and make sure number is 4 digits
			**************/
			number = (int)(Math.random() * 10000);
			if (number < 1000){
				number += 1000;
			}
			System.out.println(number);
			/**************
			* Use division and remainder to separate number into each digit
			**************/
			firstDigit = number/1000;
			secondDigit = number/100;
			thirdDigit = number/10;
			fourthDigit = number%10;
			/**************
			* If firstDigit is equal to fourthDigit and secondDigit is equal to thirdDigit, number is a palindrome
			**************/
			if (firstDigit == fourthDigit && secondDigit == thirdDigit){
				System.out.println(number + " is a palindrome");
			/***************
			* If not, print number is not a palindrome
			***************/
			}else{ 
				System.out.println(number + " is not a palindrome");
			}
		/***************
		* If option is not 0 or 1, print "Incorrect Input"
		***************/
		}else{
				System.out.println("Incorrect input");
		}
	}
}
