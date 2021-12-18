package programs;
import java.util.Scanner;

public class Vovelscheckinginastring {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a string of which vovels you want to count");
		String s1 = ip.nextLine();
		String s = s1.toLowerCase();
		int n = s1.length();
		int c=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				c+=1;
			}
		
		}
		System.out.println(c);
	}

}
