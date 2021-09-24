
//Input currency in rupees and output in USD.
import java.util.Scanner;
class Rupees
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rs;
		System.out.print("Enter Rupees:- ");
		rs=sc.nextInt();
		float dollar=rs/64;
		System.out.print("In dollars = "+dollar);
	}
}
