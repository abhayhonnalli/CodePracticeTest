package codingpracticetest;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int i,countChild=0,countAdult=0,countSeniorCitizen=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of persons : ");
		int n = input.nextInt();
		int age[] = new int[n];
		System.out.println("Enter the Ages: ");
		for(i=0;i<n;i++)
		{
			age[i]=input.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			if(age[i]<18) //condition 1
			{
				countChild++;
			}
			
			else if(age[i]>= 18 && age[i]<=54) //condition2 from age 18 to 54
			{
				countAdult++;
			}
			
 			else   //condition3 age>=55
			{
				countSeniorCitizen++;
			}
		}
		
		System.out.println("Children : "+countChild +"\n"+"Adult : "+countAdult+"\n"+ "Senior Citizen : "+countSeniorCitizen);
		
		input.close();

	}
}

