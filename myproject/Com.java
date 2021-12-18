package myproject;
import java.util.Scanner;

public class Com {
	int id;
	String name;
	double salary;
	
	Com(int id, String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("\t");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Hey enter the number of employees: ");
		int n = ip.nextInt();
		Com A[] = new Com[n];
		for(int i=0;i<n;i++) {
			System.out.println("\n");
			System.out.println("Enter Employee ID: ");
			int id = ip.nextInt();
			ip.nextLine();
			System.out.println("Enter Employee Name: ");
			String name = ip.nextLine();
			System.out.println("Enter Salary: ");
			int salary = ip.nextInt();
			A[i]=new Com(id,name,salary);
		}
		for(int i=0;i<n;i++) {
			System.out.println("\nPrinting Employee details: ");
			A[i].display();
		}
	}
}


