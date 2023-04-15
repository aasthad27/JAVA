package practice;

import java.util.Scanner;

public class bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("enter the choice 1.Term Deposit 2. Recurring \n");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			int t;
			double p,r,a;
			System.out.println("enter p");
			p=sc.nextDouble();
			System.out.println("enter r");
			r=sc.nextDouble();
			System.out.println("enter t");
			t=sc.nextInt();
			a=p*(1+r/100)*t;
			System.out.println("amount"+a);
			break;
			
		}
		case 2:
		{
			int t2;
			double p2,r2,a2;
			System.out.println("enter p");
			p2=sc.nextDouble();
			System.out.println("enter r");
			r2=sc.nextDouble();
			System.out.println("enter t");
			t2=sc.nextInt();
			a2=p2*t2+p2*t2*(t2+1)/2*(t2/100)*1/12;
			System.out.println("amount"+a2);
			break;
		}
		}
	}
}
