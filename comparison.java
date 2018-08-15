package comparison;

//Shuaib Peters
//9-14-16
//Assignment 2


//This program takes three integers as inputs and calculates the largest. 
import java.util.Scanner;

public class comparison{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num1; //First integer
		int num2; //Second integer
		int num3; //Third integer
		
		System.out.print("Please enter a number: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter a number: ");
		num2 = input.nextInt();
		
		System.out.print("Please enter a number: ");
		num3 = input.nextInt();
		
		if (num1 == num2 || num1 == 3){
			System.out.printf("You have entered %d\n more than once ", num1);
		}
		
		else if (num2 == num3 || num2 == num1){
			System.out.printf("You have entered %d\n more than once ", num2);
			}
		
		else if (num3 == num1 || num3 == num2){
			System.out.printf("You have entered %d\n more than once ", num3);
			}
	
		
		else {
		
			if (num1 > num2 && num1 > num3){
				System.out.printf("The largest number is %d\n", num1);
			}
		
			if (num2 > num1 && num2 > num3){
				System.out.printf("The largest number is %d\n", num2);
			}
		
			if (num3 > num2 && num3 > num1){
				System.out.printf("The largest number is %d\n", num3);
			}
		}
		
		
	}
}
