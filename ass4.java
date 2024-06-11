public abstract class shape1
{
  private double height;
  private double width;
  public void setValues(double height,double width)
  {
    this.height=height;
    this.width=width;
  }
  public double getheight()
  {
    return height;
  }
  public double getwidth()
  {
    return width;
  }
  void input_data()
  {
    system.out.println("Enter the height and width: " + height + + width );

  }
}
class Rectangle1 extends shape1
{
  public double compute_area();
  {
    return getheight()*getwidth();
  }
}
class Triangle1 extends shape1
{
  public double compute_area();
  {
    return getheight()*getwidth();
  }
}
class ass4
{
  public static void main(String[] args)
  {
    shape1 shape;
    Rectangle1 rect=new Rectangle1();
    shape=rect;
    shape.setValues(78,5);
    system.out.println("Area of Rectangle: " + shape.compute_area());
    Triangle1 rect=new Triangle1();
    shape=tri;
    shape.setValues(34,3);
    system.out.println("Area of Triangle1: " + shape.compute_area());
  }
}
