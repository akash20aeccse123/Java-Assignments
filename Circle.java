//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;
class Circle
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r;
		System.out.print("Enter Radius:- ");
		r=sc.nextDouble();
		Area(r);
		Circum(r);
	}
	static void Area(Double r)
	{
		double a=3.14*r*r;
		System.out.println("Area is= "+ a);
	}
	static void Circum(Double r)
	{
       double cir=2*3.14*r;
       System.out.println("Circumference is = "+cir);
	}
}
