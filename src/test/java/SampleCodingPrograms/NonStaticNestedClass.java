package SampleCodingPrograms;

public class NonStaticNestedClass {
    public static void main(String[] args) {
        ClassTest testObj = new ClassTest();
        ClassTest.InnerClass innerClassObj = testObj.new InnerClass();
        innerClassObj.get();
    }
}

class ClassTest{
    int i=20;
    static int j=30;
    private static int k=40;

    class InnerClass{
        void get(){
            System.out.println("i::"+i);
            System.out.println("j::"+j);
            System.out.println("k::"+k);
        }
    }
}