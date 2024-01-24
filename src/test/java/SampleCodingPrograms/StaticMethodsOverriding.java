package SampleCodingPrograms;

public class StaticMethodsOverriding {
    public static void main(String[] args) {
        Base b = new Child();
        b.m1();
        b.m2();
        System.out.println("b.x::"+b.x);

        Child c = new Child();
        c.m1();
        c.m2();
        System.out.println("c.x::"+c.x);
    }
}

class Base{
    int x=10;
    static int y=20;
    static void m1(){
        System.out.println("y::"+y);
    }

    void m2(){
        System.out.println("x::"+x);
        System.out.println("y::"+y);
    }
}

class Child extends Base{
    int x=20;
    static int y=30;
    static void m1(){
        System.out.println("y::"+y);
    }

    void m2(){
        System.out.println("x::"+x);
        System.out.println("y::"+y);
    }
}
