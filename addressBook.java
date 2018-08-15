

import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * 
 * @author Shuaib Peters
 *2-22-17
 *Lab 5
 *
 */
public class addressBook {
	
	private static Formatter output;
	private static Scanner input;
	
	public static void main(String[] args){
		
		openFile();
		addRecords();
		closeFile();
		openTextFile();
		readRecords();
		closeTextFile();
		
	}
	
	public static void openFile()
	{
		
		try{
			
			output = new Formatter("test.txt"); 

		}
		
		catch(FileNotFoundException fileNotFOundException){
			System.out.println("Error: Invalid File Name");
		}
	}
	
	
	public static void addRecords()
	{
		Scanner input = new Scanner(System.in);
		System.out.printf( "%s%s%s%s%n","Enter First Name, ", "Enter Last Name, ", "Phone Number, ", "and Email Address. Enter <CTRL> - Z when done: ");
		
		while (input.hasNext())
		{
			output.format("%s %s %s %s%n", input.next(), input.next(), input.next(), input.next());
		}
	}
	
	public static void closeFile()
	{
		output.close();
	}
	
	public static void openTextFile()
	{
		
		try
		{
		input = new Scanner(Paths.get("test.txt"));
		}
		
		catch (IOException ioException)
		 {
		 System.err.println("Error opening file. Terminating.");
		
		 }
		
	}
	
	public static void readRecords()
	{
		
		System.out.printf( "%n%-10s %-10s %-10s %-10s%n","First Name", "Last Name", "Phone Number", "Email Address");
		
		while (input.hasNext())
			{
			
			System.out.printf("%-10s %-10s %-10s      %-10s%n", input.next(), input.next(), input.next(), input.next());
				
			}

	}
	
	public static void closeTextFile()
	{
		input.close();
	}
	
}
