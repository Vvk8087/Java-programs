package programs;
import java.util.Scanner;

public class Stringreversalwithpalindrome {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a word to reverse it: ");
		String name = ip.next();
		String n=name.toLowerCase();
		String check=n;
		int leng = name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--) {
			rev=rev+n.charAt(i);
		}
		System.out.println("The revers of "+n+" is " +rev);
		if(rev.equals(n)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
