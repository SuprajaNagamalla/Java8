package SampleCodingPrograms;

//import static SampleCodingPrograms.AnagramProgram.testAnagram;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {
        String test1 = "testraceno";
        String test2 = "caretestis";
        System.out.println("status of Anagram::"+AnagramProgram.testAnagram(test1, test2));
    }
    //boolean @Contract(pure = true)
    static boolean testAnagram(String st1, String st2){
        boolean result = false;
        //check if length is same
        if(st1.length() == st2.length()) {
            char[] CharSt1 = st1.toLowerCase().toCharArray();
            char[] CharSt2 = st2.toLowerCase().toCharArray();
            Arrays.sort(CharSt1);
            Arrays.sort(CharSt2);
            result = Arrays.equals(CharSt1, CharSt2);
        }
        return result;
    }

}
