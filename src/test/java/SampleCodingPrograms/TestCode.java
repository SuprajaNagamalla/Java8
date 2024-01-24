package SampleCodingPrograms;

class Alpha
{
    public String type = "a ";
    public Alpha()
    {
        System.out.print("Hello ");
    }
}
public class TestCode extends Alpha
{
    public TestCode()
    {
        System.out.print("World ");
    }
    void go()
    {
        type = "b ";
        System.out.print(this.type + super.type);
    }
    public static void main(String[] args)
    {
        new TestCode().go();
        Temp obj = Temp.create(20);
        obj.myMethod();
    }
}

class Temp
{
    private Temp(int data)
    {
        System.out.printf(" cc ");
    }
    protected static Temp create(int data)
    {
        Temp obj = new Temp(data);
        return obj;
    }
    public void myMethod()
    {
        System.out.printf(" jj ");
    }
}

//public class TestCodeNext
//{
//    public static void main(String[] args)
//    {
//        Temp obj = Temp.create(20);
//        obj.myMethod();
//    }
//}
