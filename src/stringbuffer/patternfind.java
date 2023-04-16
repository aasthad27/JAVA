package stringbuffer;

import java.util.Scanner;

public class patternfind {
	public static void main(String[] args) 
	{
		String string;
		Scanner sc=new Scanner(System.in);
		string=sc.nextLine();
		char[]str=string.toCharArray();
		char s=str[0];
		int i=1,c=0;
		while(i<str.length)
		{
			if( s=='0'&& str[i]=='1' )
			{
				while( i<str.length && str[i]=='1')
				{
					i++;
				}
				if(i==str.length)
					break;
				if(i<str.length&&str[i]=='0')
				{
					c++;
				}
				
			}
			if(i==str.length)
				break;
			s=str[i];
			i++;
		}
		System.out.println(c);
	}
}
