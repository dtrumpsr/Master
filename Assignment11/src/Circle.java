

public class Circle extends Shape2D
{
private double radius;	
public Circle (String name, double r)
{
super(name);
radius =  r;
}

public double getArea()
{
return Math.PI * radius * radius;
}

public  double getCircumference()
{
	return 2*Math.PI * radius ;
}
}