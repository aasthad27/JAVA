package practice;

import java.util.Scanner;

public class friendlypair {
	static int fp(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum/n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		if((fp(n1))==(fp(n2)))
		{
			System.out.println("friendly pair");
		}
		else
		{
			System.out.println("not friendly pair");
		}
		
	}
}
