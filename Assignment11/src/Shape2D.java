

public abstract class Shape2D
{
	private String id;
	public Shape2D (String id)
	{
		this.id = id;
	}

	public abstract double getArea();
	public abstract double getCircumference();
	public final int getNumberOfAngles()
	{
		return 2;
	}
}
