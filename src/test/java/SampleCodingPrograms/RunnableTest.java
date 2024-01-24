package SampleCodingPrograms;

public class RunnableTest {
    public static void main(String[] args) {
        int x =100;
        int finalX = x;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(finalX);
            }
        };
        System.out.println(++x);
    }
}
