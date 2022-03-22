package com.simplilearn.demo;
import java.util.Scanner;
public class arthimaticCalculator {
	

	
	  public static void main(String[] args) {

	    char operator;
	    int number1, number2, result;

	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter first number");
	    number1 = input.nextInt();

	    System.out.println("Enter second number");
	    number2 = input.nextInt();

	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    switch (operator) {

	      // addition operation
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // subtraction operation
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // multiplication operation
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // division operation5
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    	  }
	}
