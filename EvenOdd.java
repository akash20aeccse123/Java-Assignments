//Write a program to print whether a number is even or odd, also take input.
import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter Number to check:- ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.print("Even Number");
		}
		else
		{
			System.out.print("Odd Number");
		}
	}
}