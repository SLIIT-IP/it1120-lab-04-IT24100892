import java.util.Scanner;
public class IT24100892Lab4Q1
{
		public static void main (String[]args)
		{
			Scanner value = new Scanner (System.in);		//declare scanner class to get input from keyboard
			double num;						//declare variable
			System.out.print("Enter a number : ");
			num = value.nextDouble();				//input keyboard value
			if (num > 0) 						//declare condition
			{
				System.out.println("The number is: Positive");  //print output
			}
			else if (num < 0) 
			{
				System.out.println("The number is: Negative");  //print output

			}	
			else  
			{	
				System.out.println("The number is: Zero"); 	//print output

			}
		}
}