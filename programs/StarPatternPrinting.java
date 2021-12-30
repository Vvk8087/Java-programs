package programs;
import java.util.Scanner;

public class StarPatternPrinting {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the star pattern you want create\n1.Triangle pattern at left\n2.Reverse triangle pattern at left\n3.Traingle pattern at right"
				+ "\n4.Reverse traingle pattern at right\n5.Pyramid star pattern\n6.Reverse Pyramid star\n7.Diamond star pattern"
				+ "\n8.Half diamond pattern at left");
		int num = ip.nextInt();
		switch(num) {
		case 1://Program to print the triangle pattern at left side 
			System.out.println("Enter the number of pattern rows you want to create for left triangle: ");
			int n = ip.nextInt();
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<=i;j++) {
				System.out.print("*");
				}
				System.out.print("\n");
			}
			break;
			
		case 2: //Program to print the reverse triangle pattern at left
			System.out.println("Enter the number of reverse pattern rows you want to create for left triangle: ");
			int a = ip.nextInt();
			for(int i=0;i<a;i++) {
				
				for(int j=a;j>i;j--) {
				System.out.print("*");
				}
				System.out.print("\n");
			}
			break;
			
		case 3: //Program to print the triangle pattern at right side 
			System.out.println("Enter the number of pattern rows you want to create for right traingle: ");
			int b = ip.nextInt();
			for(int i=0;i<b;i++) {
				
				for(int j=b-1;j>i;j--) {
				System.out.print(" ");
				}
				
				for(int k=0;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 4: //Program to print the reverse triangle pattern at right
			System.out.println("Enter the number of reverse pattern rows you want to create for right traingle: ");
			int c = ip.nextInt();
			for(int i=0;i<c;i++) {
				
				for(int j=0;j<i;j++) {
				System.out.print(" ");
				}
				
				for(int k=c;k>i;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 5: //Progrm to print the pyramid star pattern
			System.out.println("Enter the number of pattern rows you want to create for star pyramid: ");
			int d = ip.nextInt();
			for(int i=0;i<d;i++) {
				
				for(int j=d-1;j>i;j--) {
				System.out.print(" ");
				}
				
				for(int k=0;k<=i;k++) {
					System.out.print("*");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 6: //Program to print the reverse pyramid pattern
			System.out.println("Enter the number of pattern rows you want to create for star pyramid: ");
			int e = ip.nextInt();
				for(int i=0;i<e;i++) {
				
				for(int j=0;j<i;j++) {
				System.out.print(" ");
				}
				
				for(int k=e;k>i;k--) {
					System.out.print("*");
				}
				
				for(int k=e-1;k>i;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 7: //Program to print the diamond pattern using case 6 and case 5 together
			System.out.println("Enter the pattern length you want for diamond pattern: ");
			int f = ip.nextInt();
			
				for(int i=0;i<f;i++) {
				
				for(int j=f;j>i;j--) {
				System.out.print(" ");
				}
				
				for(int k=0;k<=i;k++) {
					System.out.print("*");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
				}
				
				for(int i=f;i>=0;i--) {
					
					for(int j=f;j>i;j--) {
					System.out.print(" ");
					}
					
					for(int k=0;k<=i;k++) {
						System.out.print("*");
					}
					for(int k=1;k<=i;k++) {
						System.out.print("*");
					}
					System.out.println();
					}
				break;
				
		case 8: //Program to print the half diamond pattern at left side
			System.out.println("Enter the pattern lenght you want for half diamond pattern: ");
			int g= ip.nextInt();
			for(int i=0;i<g;i++) {
				
				for(int j=0;j<=i;j++) {
					System.out.print("*");
					}
				System.out.println(" ");
				}
			
				for(int i=0;i<g;i++) {
					
					for(int k=g-1;k>i;k--) {
						System.out.print("*");
						}
					System.out.println(" ");
				}
				break;
				
		case 9: //Program to print the half diamond pattern at left
		System.out.println("Enter the pattern lenght you want for half diamond pattern: ");
		int h=ip.nextInt();
		for(int i=0;i<h-1;i++) {
			
			for(int j=h;j>i;j--) {
				System.out.print(" ");	
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
			for(int i=h-1;i>=0;i--) {
			
			for(int j=h;j>i;j--) {
				System.out.print(" ");	
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
				
	}
			
			
			
				
}
}


