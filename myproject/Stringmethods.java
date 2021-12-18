package myproject;
import java.util.Scanner;

public class Stringmethods {

	public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		System.out.println("Enter a Name: ");
//		String name = ip.nextLine();
//		System.out.printf("lenght of: %d",(name.length()));
//		System.out.println("\nCharAt: "+(name.charAt(0)));
//		System.out.println("toUpperCase: "+(name.toUpperCase()));
//		System.out.println("toUpperCase: "+(name.toLowerCase()));
		
		String name = "VisHal";
		System.out.println("trim: "+(name.trim()));
		System.out.println("substring: "+(name.substring(3)));
		System.out.println("substring: "+(name.substring(3,5)));
//		System.out.println("replace: "+(name.replace(oldChar:'i', newChar:'l')));
		System.out.println("replace: "+(name.replace('i', 'v')));
		System.out.println("replace: "+(name.replace("Vis","kis")));
		System.out.println("startswith: "+(name.startsWith("V")));
		System.out.println("startswith: "+(name.startsWith("k")));
		System.out.println("indexof: "+(name.indexOf("s")));
		String s1= "vishal";
		System.out.println(".equal: "+(name.equalsIgnoreCase(s1)));
		
		


	}

}
