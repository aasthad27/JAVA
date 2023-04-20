package abstractclass;
import java.util.*;
abstract class Shape{
	abstract void rectangleArea(double length,double breadth);
	abstract void squareArea(double side);
	abstract void circleArea(double radius);
}
class Area extends Shape{
	void rectangleArea(double length,double breadth)
	{
		double area=length*breadth;
		System.out.println(area);
	}
	void squareArea(double side)
	{
		double area=side*side;
		System.out.println(area);
	}
	void circleArea(double radius)
	{
		double area=Math.PI*radius*radius;
		System.out.println(area);
	}
}
public class MainShape {
   public static void main(String[]args)
   {
	    Area obj=new Area();
	    obj.rectangleArea(100, 120);
	    obj.squareArea(50);
	    obj.circleArea(47);
   }
}
