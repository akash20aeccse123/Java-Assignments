//Take two numbers and print the sum of both.
import java.util.Scanner;
class AddTwo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,sum=0;
		System.out.print("Enter Two Numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=(a+b);
		System.out.print("Sum of two numbers = "+ sum);
	}
}