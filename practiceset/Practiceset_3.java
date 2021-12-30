package practiceset;
import java.util.Scanner;

public class Practiceset_3 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
	/*1) Write a java program to find out whether a student is pass or fail if it requires 
		total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an 
		input from the user*/
//		System.out.println("Enter marks for the first subject: ");
//		int s1 = ip.nextInt();
//		System.out.println("Enter marks for the second subject: ");
//		int s2 = ip.nextInt();
//		System.out.println("Enter marks for the third subject: ");
//		int s3 = ip.nextInt();
//		int add = s1+s2+s3;
//		float Percentage = add/300f*100;
//		System.out.println("Your percentage are: "+Percentage);
//		if(Percentage >= 40 && s1>=33 && s2>=33 && s3>=33) {
//			System.out.println("You are pass.!");
//		}
//		else {
//			System.out.println("Your are fail...!");
//		}
//		
		
		/*2) Write a program to find days of week of the given number (1 for monday and 2 for tuesday and so on)*/
//		System.out.println("Enter a number to find a day in a week: ");
//		int choice = ip.nextInt();
//		switch(choice) {
//		case 1: System.out.println("Monday");
//		break;
//		case 2: System.out.println("Tuesday");
//		break;
//		case 3: System.out.println("Wednesday");
//		break;
//		case 4: System.out.println("Thursday");
//		break;
//		case 5: System.out.println("Friday");	
//		break;
//		case 6: System.out.println("Saturday");
//		break;
//		case 7: System.out.println("Sunday");
//		}
		
		//Write a java program to find out the type of web-site
//		System.out.println("Enter a web-site: ");
//		String choice = ip.nextLine();
//		if(choice.endsWith(".com")) {
//			System.out.println("this is a Commercial web-site");	
//		}
//		if(choice.endsWith(".in")) {
//			System.out.println("this is an Indian web-site");
//		}
//		if(choice.endsWith(".org")) {
//			System.out.println("this is an Organizational web-site");
//		}
		
//		4) Write a java program to find whether year entered by the user is a leap year or not
//		System.out.println("Enter a year to check whether it is leap year or not: ");
//		int year = ip.nextInt();
//		if(year%400==0 || (year%100!=0 && year%4==0)) {
//			System.out.println("This is a leap year");
//		
//		}
//		else {
//			System.out.println("This is not a leap year");
//		}
		
		System.out.println("Enter your annual income in lakhs");
		float inc = ip.nextFloat();
		float tax = 0;
		if(inc<=2.5f) {
			tax=tax+0;
		}
		else if(inc>=2.5f && inc<=5f) {
			tax=tax+0.05f*(inc-2.5f);
		}
		else if(inc>=5f && inc<=10f) {
			tax=tax+0.05f*(5f-2.5f);
			tax=tax+0.2f*(inc-2.5f);
		}
		else if(inc>=5f && inc<=10f) {
			tax=tax+0.05f*(5f-2.5f);
			
		}
		else if(inc>10f) {
			tax=tax+0.05f*(5f-2.5f);
			tax=tax+0.2f*(10f-5f);
			tax=tax+0.2f*(inc-10f);
		}
		System.out.println("You have to pay "+tax+" lakh Rs. on your income");
		
		

	}
	

}
