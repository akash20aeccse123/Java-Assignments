
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
class LargestTwo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter two numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();

		if(a>b)
		{
			System.out.print(a+" is largest");
		}
		else
		{
			System.out.print(b+" is largest");
		}
	}
}
