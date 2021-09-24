//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
class Multiplication
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int mul;
		System.out.print("Enter number :- ");
		n=sc.nextInt();
		System.out.println("Table is :- ");
		for(int i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println(n+"x"+i+"="+mul);
		}

	}
}
