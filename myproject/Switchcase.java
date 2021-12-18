package myproject;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter a grade you got to know your percentage: ");
	char grade = ip.next().charAt(0);
	switch(grade) {
	case 'a': System.out.println("Above 90%");
	break;
	case 'b': System.out.println("Above 75%");
	break;
	default: System.out.println("Enter a correct choice");
	}
}

}
