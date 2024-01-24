package SampleCodingPrograms;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,4,2,8,23,14,5,78,45,33,9,10};
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for(int v:arr)
        System.out.print(v+" ");
        System.out.println();
//        1
//        3 5
//        7 9 11
//        13 15 17 19
        int noToDisplay=1;
        System.out.println((2+noToDisplay)+" no to be displayed");
        for(int i=1;i<=4;i++){
            for(int j=1; j <= i; j++) {
                System.out.print(noToDisplay+" ");
                noToDisplay=noToDisplay+2;
            }
            System.out.println();
        }

    }
}
