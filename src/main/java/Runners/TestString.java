package Runners;

import java.util.HashMap;

public class TestString {

    public static void main(String[] args) {
        System.out.println(10+20+"Java");
        System.out.println("Java"+10+20);
        /*for(int i=0;i;i++){
            System.out.println("hello");
        }*/
        String test = "testing of char count of a given string";
        char[] charArray = test.toCharArray();
        HashMap<Character, Integer> charCount= new HashMap<Character, Integer>();
        for(char ch:charArray){
            if(charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            }else{
                charCount.put(ch,1);
            }
        }
        System.out.println("charCount of given string is::"+charCount);

    int i, j, line=3;

    for(i=1;i<=line;i++){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }

}
