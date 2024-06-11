public abstract class shape11
{
	private double height;
	private double width;
	public void setValues(double height,double width)
	{
		this.height=height;
		this.width=width;
	}
	public double getHeight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	void input_data()
	{
		System.out.println("Enter the height and width: " + height + "" + width);
	}
	public abstract double compute_area();
}
class Rectangle1 extends shape11	
{
	public double compute_area()
	{
		return getHeight()*getWidth();
	}
}
class Triangle1 extends shape11
{
	public double compute_area()
	{
		return (getHeight()*getWidth())/2;
	}
}

