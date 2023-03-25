package com.calculator;
import java.util.Scanner;

public class Calculatormethod {
		public static void main(String[] args) {
			int no1,no2;
			double n1 = 0.0, n2 = 0.0,result;
			char symbol;
	
			Scanner scan = new Scanner(System.in);
			
	        while(true)
	        {
				System.out.println("Enter first number: ");
				no1 = scan.nextInt();
				System.out.println("Enter second number: ");
				no2 = scan.nextInt();
				System.out.println("Enter Symbol:(+,-,*,/,%)");
				symbol = scan.next().charAt(0);
			
				switch (symbol) {
				case '+':
					result = CalculatorMain.add(no1, no2);
					System.out.println("Addition is :" + result);
					break;

				case '-':
					result = CalculatorMain.sub(no1,no2);
					System.out.println("substraction is: " + result);
					break;

				case '*':
					result = CalculatorMain.multi(no1, no2);
					System.out.println("Multiplication is :" + result);
					break;

				case '/':
					result = CalculatorMain.div(no1, no2);
					System.out.println("Division is :" + result);
					break;

				case '%':
					result = CalculatorMain.module(n1, n2);
					System.out.println("Module is : " + result);
					break;

				default:
					System.out.println("Invalid  Symbol ");
					System.exit(0);
					break;
				}
				
			}
			 
		}
}
	
		
