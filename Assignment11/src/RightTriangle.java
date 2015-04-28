
public class RightTriangle extends Shape2D
{
	double width;
	double height;
public RightTriangle (String name, double w, double h)
{
super(name);
width = w;
height = h;
}

public double getArea()
{
return 0.5* width*height;
}

public  double getCircumference()
{
	double d=height*height+width*width;
	return width+ height+ Math.sqrt(d) ;
}

}