import java.util.Scanner;
public class hollowRhombus {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // Input number of rows for the rhombus
       System.out.print("Enter the number of rows: ");
       int n = sc.nextInt();
       // Generate the hollow rhombus pattern
       for (int i = 1; i <= n; i++) {
           // Print leading spaces
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }
           // Print stars and spaces for hollow effect
           for (int k = 1; k <= n; k++) {
               if (i == 1 || i == n || k == 1 || k == n) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           // Move to the next line
           System.out.println();
       }
   }
}