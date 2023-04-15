package practice;
import java.util.*;
public class swap {
	public static void main(String[] args) 
		{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
		
	}
}
