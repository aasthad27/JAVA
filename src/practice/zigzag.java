package practice;
import java.util.*;
public class zigzag {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
	  boolean f=true;
		int arr[]=new int[n];
	    for(i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    for(i=0;i<arr.length-1;i++)
	    {
	    	if(f)
	    	{
	    		if(arr[i]>arr[i+1])
	    		{
	    			int temp=arr[i];
	    			arr[i]=arr[i+1];
	    			arr[i+1]=temp;
	    		}
	    	}
	    	else
	    	{
	    		if(arr[i]<arr[i+1])
	    		{
	    			int temp=arr[i];
	    			arr[i]=arr[i+1];
	    			arr[i+1]=temp;
	    		}
	    	}
	    	f=!f;
	    }
	    for(i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]+" ");
	    }
	}
}
