package practice;
import java.util.*;
public class fact {
	public static void main(String[] args) {
		int f=1;
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println(f);
		
}
}
