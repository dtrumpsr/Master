
public class Rectangle extends Shape2D {


	double width;
	double height;

public Rectangle (String name, double w, double h)
{
super(name);
width = w;
height = h;
}

//Override the abstract method declared in Shape
public double getArea()
{
return width*height;
}

public  double getCircumference()
{
	return 2*(width+ height) ;
}
}