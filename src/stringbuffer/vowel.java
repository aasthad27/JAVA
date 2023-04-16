package stringbuffer;
import java.util.*;
public class vowel {
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    String str;
    str=sc.nextLine();
    StringBuffer s=new StringBuffer(str);  //
    for(int i=0;i<s.length();i++)
    {
    	char ch=s.charAt(i);
    	ch=Character.toLowerCase(ch); //
    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    	{
    		s.deleteCharAt(i);   //
    		i--;
    	}
    	
    }
    str=s.toString();
    System.out.println(str);
	}
}
