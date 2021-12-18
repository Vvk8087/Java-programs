package programs;
import java.util.Scanner;

public class Multiplicationtableofagivennumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number of which table you want: ");
		int num = ip.nextInt();
		int a=0;
		System.out.println("\n");
		for(int i=1; i<=10;i++) {
			System.out.println(num*i);
		
		}
	
	}

}
