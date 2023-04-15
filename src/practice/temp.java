package practice;
import java.util.*;
public class temp {
	public static void main(String[] args) {
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temp in farehenite");
		temp=sc.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("temp in celsius="+temp);
		
	}
}
