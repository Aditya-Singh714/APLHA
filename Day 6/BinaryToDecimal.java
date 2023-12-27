import java.lang.Math;

public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("The decimal equivalent of " + myNum + " is: " + decNum);
    }
    public static void main(String[] args) {
        binToDec(100001);
    }
}
