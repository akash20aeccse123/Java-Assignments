//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
class NumberMAx
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter Three Numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int max=MaxNumber(a,b,c);
		int min=MinNumber(a,b,c);
		System.out.println("Maximum Number is =  "+max);
		System.out.println("Minimum Number is = "+min);

	}
    static int MaxNumber(int a,int b, int c)
    {
    	if(a>b && a>c)
    		return a;
    	else if(b>c && b>a)
    		return b;
    	else
    		return c;
    }
    static int MinNumber(int a,int b,int c)
    {
    	if(a<b && a<c)
    		return a;
    	else if(b<a && b<c)
    		return b;
    	else
    		return c;
    }
}
