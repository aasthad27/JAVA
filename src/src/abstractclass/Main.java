package abstractclass;
import java.util.*;
interface Volume{
	void displayVolume();
}
class Cone implements Volume{
	double radius,height;
	public void displayVolume() {
		double volume=(1.0/3.0)*Math.PI*radius*radius*height;
		System.out.println("Volume of Cone" +volume);
	}
}
class Hemisphere implements Volume{
	double radius;
	public void displayVolume() {
		double volume=(2.0/3.0)*Math.PI*radius*radius*radius;
		System.out.println("volume of hemisphere" + volume);
	}
}
class Cylinder implements Volume{
	double radius,height;
	public void displayVolume()
	{
		double volume=Math.PI*radius*radius*height;
		System.out.println("vol of cylinder" +volume);
	}
}
public class Main {
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter radius of cone");
	  double coneRadius=sc.nextDouble();
	  System.out.println("enter height of cone");
	  double coneHeight=sc.nextDouble();
	  System.out.println("enter radius of hemisphere");
	  double hemisphereRadius=sc.nextDouble();
	  System.out.println("enter radius of cylinder");
	  double cylinderRadius=sc.nextDouble();
	  System.out.println("enter height of cylinder");
	  double cylinderHeight=sc.nextDouble();
	  Cone cone=new Cone();
	  cone.radius=coneRadius;
	  cone.height=coneHeight;
	  Hemisphere hemisphere =new Hemisphere();
	  hemisphere.radius=hemisphereRadius;
	  Cylinder cylinder=new Cylinder();
	  cylinder.radius=cylinderRadius;
	  cylinder.height=cylinderHeight;
	  cone.displayVolume();
	  hemisphere.displayVolume();
	  cylinder.displayVolume();
	  sc.close();
  }
}