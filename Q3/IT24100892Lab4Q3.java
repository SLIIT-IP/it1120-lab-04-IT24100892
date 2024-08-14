import java.util.Scanner;							// declare scanner calss to get input through keyboard
public class IT24100892Lab4Q3
{
		public static void main (String[]args)
		{
			Scanner value = new Scanner (System.in);
			double num;						// declare variable
			String result;			
			System.out.print("Enter a number : ");			//print user prompt
			num = value.nextDouble();				//input value through keyboard 
			result = (num > 0) ? "The number is: Positive":		// declare ternary Opperator
				 (num < 0) ? "The number is: Negative":
				 "The number is: Zero";
			System.out.println(" "+result);				// print the results acording to variable
		}
}