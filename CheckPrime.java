
import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter Number to Check:- ");
		n=sc.nextInt();
		PrimeNumber(n);
	}
	static void PrimeNumber(int num)
	{
		int i;
		int count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print("Number is Prime");
		}
		else
		{
			System.out.print("Number is Not  a Prime");
		}
	}
}
