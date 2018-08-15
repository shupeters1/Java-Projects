package timesTable;

/*
 * Shuaib Peters
 */

//This program takes two integers as inputs. Produces a multiplication table  of each integer within range of the two input values

import java.util.Scanner;

 
public class timesTable
{
  public static void main(String args[])
  {
    int a, b, c, d;
 
    System.out.println("Enter range of numbers to print their multiplication table");
    Scanner in = new Scanner(System.in);
 
    a = in.nextInt();
    b = in.nextInt();
 
    for (c = a; c <= b; c++) {
      System.out.println("Multiplication table of "+c);
 
      for (d = 1; d <= 15; d++) {
         System.out.println(c+"*"+d+" = "+(c*d));
      }
    }
  }
}