/**********************************************
DonutSign
This program prompts the user to input two side lengths and the larger angle of a parallelogram. These dimensions are used to calculate the total area of a sign.
The user is also prompted to input text on the sign. The total cost of the sign will then be calculated
based on the size of the text as well as the total area of the sign. Finally, the user will be prompted to 
either quit the program or calculate the cost of another sign.
2/20/2020
CMNC 255 003
***********************************************/

import java.util.Scanner;

public class DonutSign {
	public static void main(String[] args) {
		
		/**************
		* Create Scanner
		**************/
		Scanner input = new Scanner(System.in);
		
		/**************
		* Initialize variables before loop
		**************/
		double r;
		double a;
		double b;
		double C;
		String sign;
		double circleArea;
		double parallelogramArea;
		double totalArea;
		double costArea;
		double signLetters;
		double costLetters;
		double totalCost;
		boolean run2;
		
		/**************
		* Start a while loop, 'run' is initialized as boolean and turns false to exit loop
		**************/
		boolean run = true;
		while (run == true){
			
			/**************
			* Prompt user to input all dimensions and text for sign (Two half circles and a parallelogram)
			**************/
			System.out.println("Enter the radius of the circles: ");
			r = input.nextDouble();
			System.out.println("Enter the first side of the parallelogram: ");
			a = input.nextDouble();
			System.out.println("Enter the second side of the parallelogram: ");
			b = input.nextDouble();
			System.out.println("Enter the angle of the parallelogram: ");
			C = input.nextDouble();
			System.out.println("Enter the string you would like on your sign: ");
			input.nextLine();
			sign = input.nextLine();
			
			/**************
			* Calculate totalCost
			**************/
			circleArea = Math.PI * Math.pow(r,2);
			parallelogramArea = a * b * Math.sin(C);
			totalArea = circleArea + parallelogramArea;
			costArea = totalArea * 2.85;
			signLetters = sign.replace(" ", "").length();
			costLetters = 1.65 * signLetters;
			totalCost = costArea + costLetters;
			totalCost = Math.round(totalCost*100)/100.00;
			System.out.println("$" + String.format("%.2f",totalCost));
			
			/**************
			* Prompt user to quit program or continue.  
			* While loop used to keep asking if invalid input. 'run2' is initailized boolean and turns false to exit loop
			**************/
			run2 = true;
			System.out.println("Would you like to create another sign? Enter quit to exit.");
			String request = input.nextLine();
			while (run2 == true){
				if (request.compareTo("quit")==0){
					run = false;
					run2 = false;
				}
				else if (request.compareTo("yes")==0){
					run2 = false;
				}
				else {
					System.out.println("Input Invalid");
					System.out.println("Would you like to create another sign? Enter quit to exit.");
					request = input.nextLine();
				}
			}
		}
	}
}
