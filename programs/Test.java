package programs;

public class Test {

	public static void main(String[] args) {
		int a=5, b=6, c=8;
		int res1=(-a+b*c);
		System.out.println(res1);
		int d=55, e=9;
		int res2=(d+e)%e;
		System.out.println(res2);
		int f=20, g=3;
		int res3=(f+-g*a/c);
		System.out.println(res3);
		int h=15, i=2;
		int res4=(a+h/g*i-c%g);
		System.out.println(res4);
	}

}
