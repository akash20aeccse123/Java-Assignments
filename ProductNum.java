//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
class ProductNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter Two Numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		int product=ProductTwo(a,b);
		System.out.print("Product is = "+product);
	}
	static int ProductTwo(int a, int b)
	{
		return a*b;
	}
}
