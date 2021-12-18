package exerciseprograms;
import java.util.Scanner;

public class Computer {
	String brand;
	double sn;
	int ram;
	int rom;
	
	Computer(String brand, double sn, int ram,  int rom){
		this.brand=brand;
		this.sn=sn;
		this.ram=ram;
		this.rom=rom;
	}
	void display() {
		System.out.println("\t");
		System.out.println("Mobile Brand: "+brand);
		System.out.println("Serial number: "+sn);
		System.out.println("RAM: "+ram);
		System.out.println("ROM: "+rom);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Hey enter the number of objects you want create: ");
		int n = ip.nextInt();
		Computer A[] = new Computer[n];
		for(int i=0;i<n;i++) {
			System.out.println("\n");
			ip.nextLine();
			System.out.println("Enter the Mobile brand: ");
			String brand =ip.nextLine();
			System.out.println("Enter the serial No.: ");
			double sn = ip.nextDouble();
			System.out.println("How much is RAM: ");
			int ram = ip.nextInt();
			System.out.println("Enter ROM: ");
			int rom = ip.nextInt();
			A[i]=new Computer(brand,sn,ram,rom);
		}
		for(int i=0;i<n;i++) {
			System.out.println("\nPrinting Mobile details: ");
			A[i].display();
		}
	}
}

