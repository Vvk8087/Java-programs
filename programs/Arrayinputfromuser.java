package programs;
import java.util.Scanner;

public class Arrayinputfromuser {
	public static void main(String[]args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array: ");
		int n = ip.nextInt();
		int add=0;
		int arr[] = new int[n];
		for(int i=0;i<=n-1;i++) {
			System.out.println("Enter the elements in an array: ");
			arr[i] = ip.nextInt();
		}
		
		for(int i=0; i<=n-1; i++) {
			add=add+arr[i];
		}
		
	if(add%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}

	}
}
