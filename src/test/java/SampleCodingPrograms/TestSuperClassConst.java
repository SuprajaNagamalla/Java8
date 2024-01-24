package SampleCodingPrograms;

public class TestSuperClassConst {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        ClassAB ab= new ClassAB();
        ClassAB abc= new ClassB();
        System.out.println("b::"+b+" "
                +b.x);
        System.out.println("ab::"+ab+" "+ab.x);
        System.out.println("abc::"+abc+" "+abc.x);
    }

}
class ClassAB{
    int x=20;
    ClassAB(){
        this.x=x;
    }
}

class ClassB extends ClassAB{
    //int x=20;
    ClassB(){
        super();
    }
}