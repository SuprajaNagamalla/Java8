package SampleCodingPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SwapArraysData {
    public static void main(String[] args) {
        Integer[] array1 = {2, 3, 1, 1};
        Integer[] array2 = {4 ,4, 3, 2};

        //3 2 1 1
        //4 4 3 2

        Arrays.sort(array1, Collections.reverseOrder());
        Arrays.sort(array2, Collections.reverseOrder());
//    int[] sortArray1 = Arrays.sort(array1);
//    int[] sortArray2 = Arrays.sort(array2);
        System.out.println("after sort array1::"+Arrays.toString(array1));
        System.out.println("after sort array2::"+Arrays.toString(array2));
        boolean foundInSecondArray = false;
        int notFoundInFirstArray=0,notFoundInSecondArray=0;
        int notfoundValue = 0;
        int position=0, firstArrayPoistion=0;

        first:
        for(int i=0; i<array1.length;i++){

            second:
            for (int j=0; j<array1.length; j++){
                if(!foundInSecondArray){
                    if(array1[i] == array2[j]){
                        foundInSecondArray = true;
                    }else{
                        notFoundInFirstArray = array2[j];
                        notFoundInSecondArray = array1[i];
                        firstArrayPoistion = i;
                        position = j;
                    }
                }
                if(foundInSecondArray){
                    continue first;
                }
            }
        }
        System.out.println("notFoundInFirstArray firstArrayPoistion  ::"+notFoundInFirstArray+" "+firstArrayPoistion +
                " notfoundInSecondArrayValue  secondArrayPoistion::"+notFoundInSecondArray+" "+position );
      int cost = swapArrayValues(array1, array2, firstArrayPoistion, position, notFoundInFirstArray, notFoundInSecondArray);
        System.out.println("cost for swap::"+cost);
        System.out.println("after swap array1::"+Arrays.toString(array1));
        System.out.println("after swap array2::"+Arrays.toString(array2));
    }
    static int swapArrayValues(Integer[] arr1, Integer[] arr2, int firstArrayPoisition, int secondArrayPoistion, int firstArrayValue, int secondArrayValue){
       arr1[firstArrayPoisition] = secondArrayValue;
       arr2[secondArrayPoistion] = firstArrayValue;
        return firstArrayValue>secondArrayValue?secondArrayValue:firstArrayValue;
    }

}
