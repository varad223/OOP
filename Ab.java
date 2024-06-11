class Ab
{
	public static void main(String[] args)
	{
		shape11 shape;
		Rectangle1 rect=new Rectangle1();
		shape=rect;
		shape.setValues(78,5);
		System.out.println("Area of Rectangle: " + shape.compute_area());
		Triangle1 tri=new Triangle1();
		shape=tri;
		shape.setValues(78,5);
		System.out.println("Area of Triangle: " + shape.compute_area());
	}
}
