package SampleCodingPrograms;

public class InheritanceSample {

    public static void main(String s[]){

        ClassTwo two = new ClassTwo();
        System.out.println(two.x);
    }
}

class ClassOne{
    int x=10;

    ClassOne(){
        this.x=x;
        System.out.println("This is one");
    }

    public void m1(){
        System.out.println("test public");
    };

    protected void m2(){
        System.out.println("test protected");
    };
}

class ClassTwo extends ClassOne{
//    int x=20;

    ClassTwo(){
        //super();
        System.out.println("This is two");
    }

//    protected void m1(){
//        System.out.println("test public");
//    }

    public void m2(){
        System.out.println("test public");
    };
}