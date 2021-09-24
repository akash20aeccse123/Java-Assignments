//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
class Calculate
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter two Numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		char op;
		System.out.print("Enter operator [ + - * /] = ");
		op=sc.next().charAt(0);
		if(op=='+')
		{
			int sum=a+b;
			System.out.print(sum);
		}
		if(op=='-')
		{
			int sub=a-b;
			System.out.print(sub);
		}
		if(op=='*')
		{
			int mul=a*b;
			System.out.print(mul);
		}
		if(op=='/')
		{
			float div=a/b;
			System.out.print(div);
		}

	}
}
