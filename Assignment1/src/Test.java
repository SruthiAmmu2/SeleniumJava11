import java.util.Scanner;


public class Test {

	//Initialize the Score Variable
	
   float score;
	
	
	public static void main(String[] args) {
					
		Test Grade = new Test();
		Grade.ProcessGrades();
				
	}
	
	public void ProcessGrades()
	{
			
		float mark1, mark2, mark3, mark4, total;
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the marks for Maths");
		mark1 = in.nextFloat();
		
		
		System.out.println("Enter the marks for English");
		mark2 = in.nextFloat();
		
		System.out.println("Enter the marks for Science");
		mark3 = in.nextFloat();
		
		System.out.println("Enter the marks for Social");
		mark4 = in.nextFloat();
		
		System.out.println("Percentage Obtained");
		total = mark1+mark2+mark3+mark4;

		score = total/4;
		System.out.println(score);
		
		if
		((score >=90) && (score<=100))
		{
		System.out.println("Excellent");
		}
		else
		if
		((score >= 80)&&( score <=89 )) 
		{
			System.out.println("Very Good");	
		}
		else
		if
		((score >= 60) && (score <= 79))
		{
			System.out.println("Good");
		}
		else
		if
		((score >= 40) && (score <=59))
		{
			System.out.println("Average");
		}
		else 
		if
		(score < 40)
		{
			System.out.println("Poor");
		}	
		else
		
			System.out.println("Invalid Marks entered");
		
	}
}
