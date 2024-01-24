package SampleCodingPrograms;

public class StaticNestedClass {
    public static void main(String[] args) {
        ClassA.ClassB bObj = new ClassA.ClassB();
        bObj.get();

    }

}

class ClassA {
    static int x=10;
    int y=20;
    private static int z=30;

   void m1(){
       System.out.println("method m1 in Class A");
   }
    static class ClassB{
        void get(){

            System.out.println("x::"+x);
            System.out.println("z::"+z);
        }
    }
}
