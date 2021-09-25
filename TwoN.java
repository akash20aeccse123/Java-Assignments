
//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
class TwoN
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter Two Numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();

		int ans=SumTwo(a,b);
		System.out.print("Sum is = "+ans);
	}
	static int SumTwo(int a,int b)
	{
		return a+b;
	}
}
