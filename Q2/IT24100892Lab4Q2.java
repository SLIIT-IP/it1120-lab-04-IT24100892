import java.util.Scanner ;
public class IT24100892Lab4Q2
{
	public static void main(String[] args)
	{
		
		double lab_marks , exam_marks, final_marks, exam_per , lab_per, sum_per ; 		// declare variables
		
		Scanner value = new Scanner(System.in);							// enter exam marks & check criteria
		System.out.print("Please enter exam marks (out of 100): ");
		exam_marks= value.nextDouble();	
		if( exam_marks >= 100 || exam_marks <= 0 )
		{System.out.println ("Invalid input for exam marks. Terminating program.");
		System.exit(0);										 // Ends the program with status code 0
		}
		
		System.out.print("Please enter lab submission marks (out of 100): ");			// enter lab submition marks & check criteria
		lab_marks= value.nextDouble();
		if ( lab_marks >= 100 || lab_marks <= 0 )
		{System.out.println ("Invalid input for lab subbmition marks. Terminating program.");
		System.exit(0);										// Ends the program with status code 0

		}
		
		System.out.print("Please enter the percentage given for the exam: ");			// enter exam precentage & check criteria
		exam_per = value.nextInt();
		if ( exam_per >= 100 || exam_per <= 0 )
		{System.out.println ("Invalid input for the percentage given for the exam. Terminating program.");
		System.exit(0);										// Ends the program with status code 0

		}

		System.out.print("Please enter the percentage given for the lab submission: ");		// enter lab submission & check criteria
		lab_per = value.nextInt();
		if ( lab_per >= 100 || lab_per <= 0 )
		{System.out.println ("Invalid input for lab percentage given for the lab submission. Terminating program.");
		System.exit(0);										// Ends the program with status code 0

		}
		sum_per = exam_per + lab_per ;								//calculate sums of percentage
		final_marks = (exam_marks * (exam_per / 100)) + (lab_marks * (lab_per / 100));		//calculate final marks
		
		
		if (sum_per == 100) 
		{
		System.out.println("Final Exam Mark is : "+final_marks);				//if percentage add upto 100 print final marks
		}
		else 
		{System.out.println("The percentages must add up to 100. Terminating program.");
		System.exit(0);										//ends the program with status code 0
		}
			
	}
}