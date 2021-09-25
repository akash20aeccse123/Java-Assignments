//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
class Vote
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter Age toc check:- ");
		age=sc.nextInt();
		CheckAge(age);
	}
	static void CheckAge(int age)
	{
		if(age>=18)
			System.out.print("Eligible for vote");
		else
			System.out.print("Not Eligible for vote");
	}
}
