//take two numbers and calculate hcf and lcm
import java.util.Scanner;
class HcfLcm
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter 1st Number:- ");
		a=sc.nextInt();
		System.out.print("Enter 2nd Number:- ");
        b=sc.nextInt();
        
        int temp=0;
        int temp1=a;
        int temp2=b;
        while(temp2!=0)
        {
        	temp=temp2;
        	temp2=temp1%temp2;
        	temp1=temp;

        }
        int hcf=temp1;
        int lcm=(a*b)/hcf;
        System.out.println("Hcf is = "+hcf);
        System.out.println("Lcm is = "+lcm);

	}
}
