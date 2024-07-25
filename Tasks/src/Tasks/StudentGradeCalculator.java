package Tasks;
import java.util.*;
public class StudentGradeCalculator 
	{
			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
			  int sub,tm=0;
			  double per = 0;
			
			  System.out.println("Enter the total number of subject");
			  sub=sc.nextInt();
			 
			 int[] marks=new int[sub];
			 
			//Enter the marks of each subject
			 for(int i=0;i<sub;i++)
			 {
				 System.out.println("Mark of subject " +(i+1)+ " is ");
				 marks[i]=sc.nextInt();	
				 //Calculating the total marks
				 tm=marks[i] + tm;
				 //Calculating the percentage
				 per=(double)tm/sub;
			 }
			 
			 //Grade Calculation
			 String g;
		     if (per >= 90) {
		         g= "A";
		     } else if (per >= 80) {
		         g = "B";
		     } else if (per >= 70) {
		         g= "C";
		     } else if (per >= 60) {
		         g= "D";
		     } else {
		         g= "Fail";
		     }
			 
			
			//Displaying results
			System.out.println("Total marks: " +tm);
			System.out.println("And the percentage:" +per);
			System.out.println("Grade : " +g);
			 }
		
}
