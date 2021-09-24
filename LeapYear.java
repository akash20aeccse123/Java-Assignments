//Input a year and find whether it is a leap year or not.
import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y;
		System.out.print("Enter year to check:- ");
		y=sc.nextInt();

		if(y%4==0 && y%100!=0 || y%400==0)
		{
			System.out.print("Leap Year");
		}
		else
		{
			System.out.print("Not a Leap Year");
		}
	}
}