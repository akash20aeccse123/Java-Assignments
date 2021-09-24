//Take name as input and print a greeting message for that name.
import java.util.Scanner;
class Greeting
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter Your Name:- ");
		str=sc.nextLine();
		System.out.print("Welcome to Java programming "+ str);
	}
}