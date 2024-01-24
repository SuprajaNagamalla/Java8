package SampleCodingPrograms;

class Shape
{
//    static double width;
//    static double length;

    protected double width;
    protected double length;
    public Shape(double width, double length)
    {
        this.width=width;
        this.length= length;
    }
    public double calculateArea()
    {
        return 0;
    }

}

class Rectangle extends Shape{
    public Rectangle(double width, double length)
    {
        super(width, length);
    }
    public double calculateArea()
    {
        return width*length;
    }
}

class Triangle extends Shape{
    public Triangle(double width, double length)
    {
        super(width, length);
    }
    public double calculateArea()
    {
        return (width*length)/2;
    }
}
class call
{
    public double calling(Shape s)
    {
        return s.calculateArea();
    }
}

public class TestCodeNext3
{
    public static void main(String[] args)
    {
        call c = new call();
        Rectangle r = new Rectangle(5.0,10.0);
        Triangle t = new Triangle(7.0,10.0);
        System.out.println(c.calling(r));
        System.out.println(c.calling(t));
    }
}
