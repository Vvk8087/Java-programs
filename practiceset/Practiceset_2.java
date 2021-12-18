package practiceset;
//code with harry practice 2 set on java programming
import java.util.Scanner;

public class Practiceset_2 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
//		Problem 1
		String s1 = "VISHAL";
		System.out.println(s1.toLowerCase());
		
// 		Problem 2
		String s2 = "  Vishal   ";
		System.out.println(s2);
		System.out.println(s2.replace(" ", ""));
		
		//Problem 3
		String s3 = "Dear <|name|> thanks a lot...!";
		System.out.println(s3.replace("<|name|>", "Vishal"));
		
		//Problem 4
		String s4 = ip.nextLine();
		System.out.printf("Dear %s Thanks a lot...!",s4);
		
		
		//Problem 5
		System.out.printf("\n\nDear,\n\t %s\n\tThanks a lot...!",s4);
	}

}
