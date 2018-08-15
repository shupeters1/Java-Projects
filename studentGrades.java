package studentGrades;

//Shuaib Peters
//9-28-16
//Assignment 4

//This program takes integers as inputs. The numbers are averaged together, producing a number grade and letter grade

import java.util.Scanner;

public class studentGrades{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int grade = 0;
		int gradeCounter = 0;
		int total = 0;
		
		System.out.print("Welcome to the Gradebook for CSC150 Intro to Compter Science\n\n");
		
		while (grade >= 0){
			System.out.print("Please enter a grade or -1 to quit: ");
			grade = input.nextInt();
			
			if (grade >= 0){
				
				total = total + grade;
				gradeCounter++;
			}
			
			
		}
		
		int average = total / gradeCounter;
		
		if (average >= 92.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is A");
			
		}
		
		else if (average >= 89.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is A-");
		}
		
		else if (average >= 86.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is B+");
		}
		
		else if (average >= 82.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is B");
		}
		
		else if (average >= 79.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is B-");
		}
		
		else if (average >= 76.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is C+");
		}
		
		else if (average >= 72.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is C");
		}
		
		else if (average >= 69.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is C-");
		}
		
		else if (average >= 66.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is D+");
		}
		
		else if (average >= 62.5){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is D");
		}
		
		else if (average >= 59.4){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is D-");
		}
		
		else if (average <= 59.4){
			
			System.out.printf(" Average grade is %d", average);
			System.out.printf("\nLetter grade is F");
		}
	}
}

