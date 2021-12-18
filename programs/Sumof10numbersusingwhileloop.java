package programs;

public class Sumof10numbersusingwhileloop {

	public static void main(String[] args) {
		int a=1;
		int sum=0;
		while(a<=10) {
			sum=sum+a;
			a++;	
		}
		System.out.println("The sum of 10 numbers is "+sum);
	}

}
