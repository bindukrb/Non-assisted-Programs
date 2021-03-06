package nonAssistedPrograms;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
				double num1, num2;

				Scanner scan = new Scanner(System.in);

				System.out.println("Enter two numbers for operations: ");

				num1 = scan.nextDouble();

				num2 = scan.nextDouble();

				System.out.println("Enter the operator (+,-,*,/)");

				char operator = scan.next().charAt(0);

				double output = 0;

				switch (operator) {

				case '+': output = num1 + num2;
				          break;
				          
				case '-': output = num1 - num2;
		                  break;
							
				case '*': output = num1 * num2;
				          break;
					
				case '/': try{
							output = num1 / num2;
						  break;
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}

				default:
					System.out.println("You enter wrong input");
					break;
					
				}

				System.out.println("The final result:");
				System.out.println();
				System.out.println(num1 + " " + operator + " " + num2
								+ " = " + output);

	}

}
