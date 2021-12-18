package programs;
import java.util.Scanner;

public class Convertkmtomiles {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter kilometers to convert it into miles");
		float km = ip.nextFloat();
		float miles = 0.621f;
		float kmtomiles = km*miles;
		System.out.println(km+" km to miles is " +kmtomiles+" miles");

	}

}
