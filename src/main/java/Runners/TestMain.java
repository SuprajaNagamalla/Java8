package Runners;

// Java program to Compute modulus
// division by a power-of-2-number

class TestMain
{
    // Driver method
    public static void main(String[] args)
    {
        int num = 15;

        int two_power1 = 1;
        int two_power2 = 2;
        int two_power3 = 3;

        String binary = Integer.toBinaryString(num);
        int len = binary.length();

        System.out.println("Binary value of 15::"+binary);
        String rem1 = binary.substring(len-two_power1);
        String rem2 = binary.substring(len-two_power2);
        String rem3 = binary.substring(len-two_power3);

        int reme1 = Integer.parseInt(rem1, 2);
        int reme2 = Integer.parseInt(rem2, 2);
        int reme3 = Integer.parseInt(rem3, 2);

        System.out.println(num + "%" + "2^(" + two_power1 + ") = " + reme1);
        System.out.println(num + "%" + "2^(" + two_power2 + ") = " + reme2);
        System.out.println(num + "%" + "2^(" + two_power3 + ") = " + reme3);
    }
}
