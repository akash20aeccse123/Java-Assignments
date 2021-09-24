//Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p,r,t,si;
		System.out.print("Enter principal amount:- ");
		p=sc.nextInt();
		System.out.print("Enter rate:- ");
		r=sc.nextInt();
		System.out.print("Enter time:- ");
		t=sc.nextInt();
		si=p*r*t/100;
		System.out.print("Simple interest = "+si);
	}
}