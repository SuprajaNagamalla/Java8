package Runners;

public class TestNumberOrCharacter {
    public static void main(String[] args) {
        String test = "test00123";
        char[] charArrayOfInput = test.toCharArray();
        String result = "";
        //if( (c >= 'a' && c <= 'z') && (c >= 'A' && c <= 'Z'))
        //if (character >= '0' & character <= '9'){
        for (int i = 0; i < charArrayOfInput.length; i++) {
//            if (charArrayOfInput[i] != '0' && charArrayOfInput[i] != '1'
//                    && charArrayOfInput[i] != '2' && charArrayOfInput[i] != '3'
//                    && charArrayOfInput[i] != '4' && charArrayOfInput[i] != '5'
//                    && charArrayOfInput[i] != '6' && charArrayOfInput[i] != '7'
//                    && charArrayOfInput[i] != '8' && charArrayOfInput[i] != '9'){
            if (charArrayOfInput[i] >= '0' & charArrayOfInput[i] <= '9'){
                result += charArrayOfInput[i];
            }
        }
        System.out.print("result::" + result);
    }
}
