import java.util.Scanner;
import java.util.*;
public class BinaryToDecimal {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a binary number: ");
       long binary = sc.nextLong();
       int decimal = convertBinaryToDecimal(binary);
       System.out.println("Decimal equivalent of " + binary + " is: " + decimal);
   }
   public static int convertBinaryToDecimal(long binary) {
       int decimal = 0, power = 0;
       while (binary != 0) {
           long remainder = binary % 10;
           decimal += remainder * Math.pow(2, power);
           power++;
           binary /= 10;
       }
       return decimal;
   }
}