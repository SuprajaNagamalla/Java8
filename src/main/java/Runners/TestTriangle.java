package Runners;

public class TestTriangle {
    public static void main(String[] args) {
        char star='*';
        int lines=5;
        for(int i=0;i<=lines;i++){
            for(int j=0;j<i;j++){
                System.out.print(star);
            }
            System.out.println();
        }

        for(int i=lines;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(star);
            }
            System.out.println();
        }

    }
}
