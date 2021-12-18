package exerciseprograms;
import java.util.Scanner;

public class ObjarrayVehicle {
	String color;
	String brand;
	int price;
	
	
	ObjarrayVehicle(String color,String brand, int price){
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	void display() {
		System.out.println("\t");
		System.out.println("Color: "+color);
		System.out.println("Car brand: "+brand);
		System.out.println("Car price: "+price);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Hey enter the number of objects you want create: ");
		int n = ip.nextInt();
		ObjarrayVehicle A[] = new ObjarrayVehicle[n];
		for(int i=0;i<n;i++) {
			System.out.println("\n");
			ip.nextLine();
			System.out.println("Enter the car's Color: ");
			String color =ip.nextLine();
			System.out.println("Enter the car brand: ");
			String brand = ip.nextLine();
			System.out.println("Enter the car price: ");
			int price = ip.nextInt();
			A[i]=new ObjarrayVehicle(color,brand,price);
			
		}
		for(int i=0;i<n;i++) {
			System.out.println("\nPrinting Car's details: ");
			A[i].display();
		}
	}
}