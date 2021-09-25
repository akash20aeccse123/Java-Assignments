//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
class OddEven
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter Number:- ");
		num=sc.nextInt();
		Odd_Even_Check(num);
	}
	static void Odd_Even_Check(int n)
	{
		if(n%2==0)
			System.out.print("Even Number");
		else
			System.out.print("Odd Number");
	}
}
