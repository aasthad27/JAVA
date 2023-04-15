package practice;
import java.util.*;
public class replace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
        s=sc.nextLine();
        String s2=s.replaceAll("0","1");
        System.out.println("replaced"+s2);
	}
}
