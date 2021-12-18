package programs;
import java.util.Scanner;

public class Adddingevennumbersinanumber {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter a number to add even digits:");
	int num = ip.nextInt();
	int rem,sum=0;
	while(num!=0) {
		rem=num%10;
		if(rem%2==0) {
		sum=sum+rem;
		}
		num =num/10;
		
	}
	System.out.println(sum);
	}

}
