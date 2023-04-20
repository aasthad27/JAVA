package abstractclass;
abstract class Temperature{
	double temp;
	void setTempData(double temp) {
		this.temp=temp;
	}
	abstract void changetemp();
}
class Fahrenheit extends Temperature{
	double ctemp;
	void changetemp()
	{
		ctemp=(5.0/9.0)*(temp-32.0);
		System.out.println(temp+"F to c "+ ctemp);
	}
}
class Celsius extends Temperature{
	double ftemp;
	void changetemp()
	{
		ftemp=(9.0/5.0)*(temp+32.0);
		System.out.println(temp+"c to f "+ ftemp);
	}
}
public class MainStart {
  public static void main(String[]args) {
	  Temperature t=new Fahrenheit();
	  t.setTempData(98.6);
	  t.changetemp();
	  Temperature r=new Celsius();
	  r.setTempData(37.0);
	  r.changetemp();
  }
}
